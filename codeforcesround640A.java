
package codeforces;

import java.util.ArrayList;
import java.util.Scanner;
public class codeforcesround640A {
    public static void main(String[] args) {
        int t;
        Scanner ob=new Scanner (System.in);
        t=ob.nextInt();
        for(int T=1;T<=t;T++)
        {
        int n;
        n=ob.nextInt();
        if((n%10)!=0)
        {
            System.out.println(n/10);
            for(int i=n/10;i>0;i=n/10)
            {
                  
            }
        }
        else
        {
            System.out.println(1);
            System.out.println(n);
        }
        }
    }
}
