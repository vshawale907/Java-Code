import java.util.*;

public class distance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();
        int maxDist = 0;

        // compare with first character
        char first = str.charAt(0);
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) != first) {
                maxDist = Math.max(maxDist, i - 0);
                break;
            }
        }

        // compare with last character
        char last = str.charAt(n - 1);
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != last) {
                maxDist = Math.max(maxDist, (n - 1) - i);
                break;
            }
        }

        System.out.println(maxDist);
    }
}
