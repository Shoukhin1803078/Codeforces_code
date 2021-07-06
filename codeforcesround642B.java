package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforcesround642B {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int T;
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {
            int n, k;

            n = ob.nextInt();
            k = ob.nextInt();
            Integer a[] = new Integer[n];
            Integer b[] = new Integer[n];

            for (int i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = ob.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());
           int a1=0;
            for(int i=1;i<=k;i++)
            {
               if(a[a1]<b[a1])
               {
               int temp=a[a1];
               a[a1]=b[a1];
               b[a1]=temp;
               }
               a1++;
            }
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
              sum=sum+a[i];  
            }
            System.out.println(sum);
            
        }

    }
}
