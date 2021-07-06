package codeforces;

import java.util.Scanner;

public class codeforcesround639A {

    public static void main(String[] args) {
        int T;
        Scanner ob = new Scanner(System.in);
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {

            int n, m;
            n = ob.nextInt();
            m = ob.nextInt();
            if (n == 1 || m == 1 || (n == 2 && m == 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
