package codeforces;
import java.util.Scanner;
public class codeforce1350A {
     static int  function(int n)
        {
         int a=0;
         for(int i=2;i<=n;i++)
         {
          if(n%i==0)
          {
          a=i;
          break;
          }
         }
         return a;
         
        }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int T;
        T=ob.nextInt();
        for(int t=1;t<=T;t++)
        {
        int n,k;
        n=ob.nextInt();
        k=ob.nextInt();
        int x;
        for(int i=0;i<k;i++)
        {
        x=function(n);
        n=n+x;
        }
          System.out.println(n);
        }
    }
}