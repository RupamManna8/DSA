import java.util.List;
import java.util.Stack;

/**
 * ScoreParentheses
 */
public class ScoreParentheses {

    public static int scoreOfParentheses(String s) {
        char close = ')';
        Stack<Character> myStack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == close) {
                myStack.pop();
                if (myStack.isEmpty()) {
                    count++;
                } else {
                    count += 2;
                }
            } else {
                myStack.add(s.charAt(i));
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("((()))"));
    }
}