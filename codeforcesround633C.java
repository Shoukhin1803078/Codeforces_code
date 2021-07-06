
package codeforces;

import java.util.Scanner;

public class codeforcesround633C {
    public static void main(String[] args) {
       int n;
       Scanner ob=new Scanner (System.in);
       n=ob.nextInt();
       int a[]=new int [n];
       for (int i=0;i<a.length;i++)
       {
        a[i]=ob.nextInt();
       }
       int k=0;
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
           for(int j=i+1;j<;j++)
           {
               System.out.println(a[i]+""+a[j]);
           }
       }
    }
}
