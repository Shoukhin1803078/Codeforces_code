package codeforces;

import java.util.Scanner;

public class codeforcesround638A {

    public static void main(String[] args) {
        int t;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        for (int T = 1; T <= t; T++) {
            int n;
            n = ob.nextInt();
            int sum1 = 0, sum2 = 0;
            for (int i = 1, j = 2; i <= n; i++) {
                if (i < n / 2 || i == n) {
                    sum1 = sum1 + j;
                } else {
                    sum2 = sum2 + j;
                }
                j = j * 2;
            }
            System.out.println(Math.abs(sum1 - sum2));
            sum1 = 0;
            sum2 = 0;
        }
    }
}