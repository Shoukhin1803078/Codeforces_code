
package codeforces;

import java.util.Scanner;

public class Educationalround86A {
        public static void main(String[] args) {
        int t;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        for (int T = 1; T <= t; T++) {
            int a,b,c,d;
            a=ob.nextInt();
            b=ob.nextInt();
            c=ob.nextInt();
            d=ob.nextInt();
            if(b>=a)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(b+(c*d));
            }
        }
    }  
}