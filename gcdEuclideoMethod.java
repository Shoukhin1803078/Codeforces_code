package codeforces;

import java.util.Scanner;

public class gcdEuclideoMethod {

    static int  GCD(int a, int b) {
        int r = a % b;
        while (r != 0) {
            if (a == (b * ((a - r) / b)) + r) {
                a = b;
                b = r;
            }
            r = a % b;
        }
        return b;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner ob = new Scanner(System.in);
        a = ob.nextInt();
        b = ob.nextInt();
        if (b > a) {int temp = b;  b = a;a = temp;   }
 
        
      int gcd= GCD(a,b);   
        System.out.println("gcd="+gcd);
        System.out.println("lcm=" + ((a * b) / gcd));
    }
}
