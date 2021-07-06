package codeforces;

import java.util.Scanner;

public class Codeforces1335A {

    public static void main(String[] args) {
        int t;
        int n, k = 0;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        for (int i = 0; i < t; i++) {
            n = ob.nextInt();
            if (n > (2 * Math.pow(10, 9))) {

            } else {
                int ans = (n - 1) / 2;
                System.out.println(ans);
            }
        }

    }
}
