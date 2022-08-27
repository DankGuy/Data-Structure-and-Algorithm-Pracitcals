public class P1Q4 {
    public static void main(String[] args) {
        String mathExpression = "62+53*/";
        double result = MathToolKit.evaluatePostfix(mathExpression);
        System.out.printf("%s = %.4f\n", mathExpression, result);
    }
}
