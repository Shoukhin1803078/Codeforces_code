package codeforces;

import java.util.Scanner;

public class contest {

    public static void main(String[] args) {

        int t, x, y, a, b;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        for (int i = 0; i < t; i++) {

            x = ob.nextInt();
            y = ob.nextInt();
            a = ob.nextInt();
            b = ob.nextInt();
            if ((x == 0) && (y == 0)) {
                System.out.println(0);
            } else if (x > y) {
                // int k1 = 0;
                // for (int j = 0; i < x; i++) {
                //   x--;
                // k1++;
                //if (x == y) {
                //  break;
                // }
                //}
                //int sum1 = (k1 * a) + b;
                // System.out.println(sum1);
                int m2 = (((x - 1) * a) + b);
                System.out.println(m2);

            } else if (y > x) {
                //int k = 0;
                //for (int j = 0; i < y; i++) {
                //  y--;
                //k++;
                //if (x == y) {
                //  break;
                //}
                // }
                //int sum1 = (k * a) + b;
                // System.out.println(sum1);
                int m1 = (((y - 1) * a) + b);
                System.out.println(m1);
            } else {
                // int k2 = 0;
                //for (int j = 0; j < x; j++) {
                //  k2++;
                //}
                //int sum2 = (k2 + 1) * b;
                //System.out.println(sum2);
                int m3=(x*b);
                System.out.println(m3);
                
            }

        }
    }
}
