import java.util.*;

public class minimumsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

      
        Arrays.sort(a);


        Arrays.sort(b);
        for (int i = 0; i < n / 2; i++) {
            int temp = b[i];
            b[i] = b[n - 1 - i];
            b[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i];
        }

        System.out.println(sum);
    }
}
