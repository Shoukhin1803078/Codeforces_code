package codeforces;

import java.util.Scanner;

public class Codeforces546A {

    public static void main(String[] shoukhin) {
        long k, w, sum = 0;
        long n;
        Scanner ob = new Scanner(System.in);
        k = ob.nextLong();
        n = ob.nextLong();
        w = ob.nextLong();
        for (int i = 1; i <= w; i++) {
            sum = sum + (i * k);
        }
        if (sum<=n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}