package codeforces;
import java.util.Scanner;
public class ContestRound637div2A {
    public static void main(String[] args) {
        int t, a, b, c, d, n;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        int m = 0;
        for (int i = 0; i < t; i++) {
            n = ob.nextInt();
            a = ob.nextInt();
            b = ob.nextInt();
            c = ob.nextInt();
            d = ob.nextInt();

            for (int j = a - b; j <= a + b; j++) {
                for (int k = c - d; k <= c + d; k++) {
                    if ((n * j) == k) {
                        m = 1;
                        break;
                    } else {
                        m = 0;
                    }
                }
                if (m == 1) {
                      System.out.println("Yes");
                    break;
                }
                }
             if(m==0) {
                    System.out.println("No");
                    m = 0;
            
            }
           m=0;
        }
    }
}