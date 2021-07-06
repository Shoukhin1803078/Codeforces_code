package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class codeforces1365C {

    public static void main(String[] args) {
        int n;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        Integer a[] = new Integer[n];
        Integer b[] = new Integer[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = ob.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = ob.nextInt();
        }
        Arrays.sort(a);
        int k = 0;
        for (int i = 0; i < b.length; i++) {
           if(a[i]==b[i])
        }
        System.out.println(k);
        
        
        
        
    }
}
