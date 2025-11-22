package cong;

import java.util.Scanner;

public class halfarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(a);
        System.out.println(b);
    }
}
