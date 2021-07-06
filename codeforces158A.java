package codeforces;

import java.util.Scanner;

public class codeforces158A {

    public static void main(String[] args) {
        int n, k;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        k = ob.nextInt();
        int a[] = new int[n];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = ob.nextInt();
        }
    
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= a[k - 1] && a[i]>0) {
                count++;
            }
        }
        
        System.out.println(count);

    }
}
