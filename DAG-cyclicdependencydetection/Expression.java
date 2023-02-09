import java.util.ArrayList;
import java.util.List;

class Expression {
    String variable;
    String operator;
    List<Expression> dependencies;

    public Expression(String x, String s, String a, String variable, String operator) {
        this.variable = variable;
        this.operator = operator;
        this.dependencies = new ArrayList<>();
    }

    public void addDependency(Expression expression) {
        dependencies.add(expression);
    }
}
