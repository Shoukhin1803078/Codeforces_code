package codeforces;

import java.util.Scanner;

public class codeforce1365B {

    public static void main(String[] args) {
        int T;
        Scanner ob = new Scanner(System.in);
        T = ob.nextInt();
        for (int t = 0; t < T; t++) {
            int n;
            n = ob.nextInt();
            Integer a[] = new Integer[n];
            Integer b[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = ob.nextInt();
            }

            int k1 = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    k1 = 1;//unsorted
                    break;
                } else {
                    k1 = 0;//sorted
                }
            }

            int x = 0, y = 1;
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (x == b[i]) {
                    k = 0;//sudhu 0 ase
                } else {
                    k = 1;
                    break;//0 1 ase
                }
            }
            if (n == 1) {
                System.out.println("Yes");
            } else if ((k1 == 0) && (k == 0)) {
                System.out.println("Yes");
            } else if ((k1 == 1) && (k == 0)) {
                System.out.println("No");
            } else if ((k == 1) && (k1 == 0)) {
                System.out.println("Yes");
            } else if ((k == 1) && (k1 == 1)) {
                System.out.println("Yes");
            }

        }
    }
}
