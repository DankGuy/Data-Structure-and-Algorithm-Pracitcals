import java.util.Stack;

public class P1Q3 {

    public static boolean checkBalance(String expr) {
        Stack<Character> bracketStack = new Stack<>();
        boolean match = true;

        for (int i = 0; i < expr.length() && match; ++i) {
            char ch = expr.charAt(i);

            switch (ch) {
                case '{':
                case '[':
                case '(':
                    bracketStack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (bracketStack.empty()) {
                        return false;
                    }
                    else {
                        char leftBracket = bracketStack.pop();

                        switch (ch) {
                            case '}':
                                match = leftBracket == '{';
                                break;
                            case ']':
                                match = leftBracket == '[';
                                break;
                            case ')':
                                match = leftBracket == '(';
                                break;

                        }
                    }
            }
        }

        if (!match || !bracketStack.empty()) {
            return false;
        }
        else {
            return true;
        }
    }
}
