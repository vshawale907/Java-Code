import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] arr = st.split(" ");
        String ans = arr[0];
        int maxL = Integer.MIN_VALUE;
        for (String s : arr) {
            if (maxL < s.length()) {
                ans = s;
                maxL = s.length();
            }
        }
        System.out.println("word: " + ans);
        System.out.println("index: " + st.indexOf(ans));

    }
}
