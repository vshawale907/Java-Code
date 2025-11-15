import java.util.*;

public class validparentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets → push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            // Closing brackets
            else {
                if (s.isEmpty())
                    return false; // No matching opening

                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '{' && ch == '}') ||
                        (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false; // Mismatch found
                }
            }
        }
        // If stack is empty at the end → valid
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[()]";
        System.out.println(isValid(str)); // true
    }
}
