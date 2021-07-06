
package codeforces;
import java.util.Scanner;
public class testinground16B {
    public static void main(String [] args)
    {
        int T;
        Scanner ob=new Scanner (System.in);
        T=ob.nextInt();
        for(int t=0;t<T;t++)
        {
        int a,b,c,d;
        a=ob.nextInt();
        b=ob.nextInt();
        c=ob.nextInt();
        d=ob.nextInt();
       if(((Math.min(a,b)+Math.min(c, d))==Math.max(a, b))&&((Math.max(a, b))==Math.max(c, d)))
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
        }
    }
}