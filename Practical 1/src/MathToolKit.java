import java.util.Stack;

public class MathToolKit {
    public static double evaluatePostfix(String str) {
        Stack<Double> operands = new Stack<>();
        Double temp1;
        Double temp2;
        char[] charArr = str.toCharArray();

        for (char ch:charArr) {
            if (ch >= '0' && ch <= '9') { // if it is a digit it will be pushed into the stack
                operands.push((double) (ch - '0')); // - '0' to get the actual decimal value
            } else {
                // get 2 values from the operands stack to perform operations
              temp1 = operands.pop();
              temp2 = operands.pop();

              switch (ch) {
                  case '+':
                      operands.push(temp2 + temp1);
                      break;
                  case '-':
                      operands.push(temp2 - temp1);
                      break;
                  case '*':
                      operands.push(temp2 * temp1);
                      break;
                  case '/':
                      operands.push(temp2 / temp1);
                      break;
              }
            }
        }
        return operands.pop();
    }
}
