
package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class codeforces1352A {
    public static void main(String[] args) {
        int T;
        Scanner ob=new Scanner (System.in);
        T=ob.nextInt();
        for(int t= 1;t<=T;t++)
        {
        int n;
        n=ob.nextInt();
        int mul=1;
        Vector v=new Vector();
        while(n>0)
        {
         if(n%10>0)
         {
          v.add((n%10)*mul);
         }
         mul*=10;
         n/=10;
        }
            int a[]=new int[v.size()];
            System.out.println(a.length);
           for(int i=0;i<v.size();i++)
           {
           a[i]=(int)v.get(i);
               System.out.print(a[i]+" ");
           }
            System.out.println();
        }
    }
 
}
