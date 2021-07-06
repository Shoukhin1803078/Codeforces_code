package codeforces;

import java.util.Scanner;

public class Codeforces231A {

    public static void main(String[] shoukhin) {
        int n, p, v, t, sum = 0;
        Scanner ob = new Scanner(System.in);
            n = ob.nextInt();
            for (int i = 0; i < n; i++) {
                p = ob.nextInt();
                v = ob.nextInt();
                t = ob.nextInt();
                if ((p & v) == 1) {
                    sum++;
                } else if ((v & t) == 1) {
                    sum++;
                } else if ((p & t) == 1) {
                    sum++;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
}