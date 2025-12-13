package cong;

import java.util.*;

public class KnowledgeEnhancement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            int first = arr[i];
            int second = arr[i + 1];
            int third = arr[i + 2];

            if (first + third == second) {
                count++;
            }
        }
        System.out.println(count);

    }
}
