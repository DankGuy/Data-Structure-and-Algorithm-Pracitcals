import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class P1Q5 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Race car"));
    }

    public static boolean isPalindrome(String inputStr) {
        Stack<Character> myStack = new Stack<>();
        Queue<Character> myQueue = new ArrayBlockingQueue<>(100);

        for (int i = 0; i < inputStr.length(); ++i) {
            char ch = inputStr.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                ch = Character.toUpperCase(ch);
                myStack.push(ch);
                myQueue.offer(ch);
            }
        }

        boolean match = true;
        while (match && !myStack.isEmpty()) {
            if (myStack.pop() != myQueue.poll()) {
                match = false;
            }
        }

        return match;
    }
}
