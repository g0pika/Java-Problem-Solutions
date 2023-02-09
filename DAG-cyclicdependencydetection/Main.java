public class Main {
    public static void main(String[] args) {
        DAG dag = new DAG();

    dag.addExpression(new Expression("X", ":=", "A", "+", "B"));
            dag.addExpression(new Expression("Y", ":=", "B", "+", "C"));
            dag.addExpression(new Expression("Z", ":=", "X", "+", "Y"));

            try {
            dag.checkCyclicDependencies();
            System.out.println("No cyclic dependencies found");
            } catch (Exception e) {
            System.out.println(e.getMessage());
            }

            dag.printDAG();
            }
            }
