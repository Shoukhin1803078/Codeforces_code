
package codeforces;

import java.util.Scanner;

public class CodeForces1030A {
     public static void main(String[] args) {
        int n;

        Scanner ob = new Scanner(System.in);
         n = ob.nextInt();
            int a[] = new int[n];
            int k = 0;
       
           
            for (int i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    k = 1;
                } else {
                    k = 0;
                    break;
                }
            }
            if (k == 1) {
                System.out.println("EASY");
            } else {
                System.out.println("HARD");
            }
        }
    }
