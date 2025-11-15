import java.util.Stack;

public class duplicateparentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;

                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // If no content between brackets -> duplicate
                if (count < 1) {
                    return true;
                }

                // remove the opening bracket
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // duplicate → true
        String str2 = "(a-b)"; // not duplicate → false

        System.out.println(str1 + " → " + isDuplicate(str1));
        System.out.println(str2 + " → " + isDuplicate(str2));
    }
}
