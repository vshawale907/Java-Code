import java.util.*;

public class mini {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }   

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);

        Arrays.sort(B);
        for (int i = 0; i < n / 2; i++) {
            int temp = B[i];
            B[i] = B[n - 1 - i];
            B[n - 1 - i] = temp;
        }

        int minSum = 0;
        for (int i = 0; i < n; i++) {
            minSum += A[i] * B[i];
        }

        System.out.println(minSum);
    }
}
