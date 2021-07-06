
package codeforces;

import java.util.Scanner;

public class codeforces1360A {
    public static void main(String[] args) {
       int T;
        Scanner ob=new Scanner (System.in);
        T=ob.nextInt();
        for(int i=0;i<T;i++)
        {
            int n ,m;
        n=ob.nextInt();
        m=ob.nextInt();
          for(int j=1;j<=1000;j++)
          {
          if((2*(n*m))==(j*j))
          {
              System.out.println(j*j);
             break;
          }
          else if((2*(n*m))<(j*j))
          {
              System.out.println((int)Math.pow((j), 2));
              break;
             
          }
          
          }
          
        }
    }
}
