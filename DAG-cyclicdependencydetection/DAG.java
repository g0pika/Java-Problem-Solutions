import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DAG {
    Map<String, Expression> expressions;

    public DAG() {
        expressions = new HashMap<>();
    }

    public void addExpression(Expression expression) {
        expressions.put(expression.variable, expression);
    }

    public void printDAG() {
        for (Expression expression : expressions.values()) {
            System.out.print(expression.variable + " " + expression.operator + " ");
            for (Expression dep : expression.dependencies) {
                System.out.print(dep.variable + " ");
            }
            System.out.println();
        }
    }

    public void checkCyclicDependencies() throws Exception {
        for (Expression expression : expressions.values()) {
            checkCyclicDependencies(expression, new ArrayList<>());
        }
    }

    private void checkCyclicDependencies(Expression expression, List<Expression> path) throws Exception {
        if (path.contains(expression)) {
            StringBuilder sb = new StringBuilder();
            for (Expression exp : path) {
                sb.append(exp.variable + "->");
            }
            sb.append(expression.variable);
            throw new Exception("Cyclic dependency detected: " + sb.toString());
        }
        path.add(expression);
        for (Expression dep : expression.dependencies) {
            checkCyclicDependencies(dep, path);
        }
        path.remove(path.size() - 1);
    }
}
