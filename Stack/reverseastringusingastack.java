
import java.util.*;

public class reverseastringusingastack {

    public static String reverseString(String str) {
        // 1. Create a stack to hold characters
        Stack<Character> s = new Stack<>();

        // 2. Push each character of the string into the stack
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        // 3. Pop all characters to build the reversed string
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop(); // Get top character
            result.append(curr); // Add to result
        }

        return result.toString(); // Convert StringBuilder to String and return
    }

    public static void main(String args[]) {
        String str = "krishna";
        String result = reverseString(str);
        System.out.println(result); // Output: anhsirk
    }
}
