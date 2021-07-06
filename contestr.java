
package codeforces;

import java.util.Scanner;

public class contestr {
    public static void main(String[] args) {
        int t,r=2;
        Scanner ob=new Scanner(System.in);
       t= ob.nextInt();
       int a[]=new int [(int)Math.pow(10,7)];
       int b[]=new int [(int)Math.pow(10,4)];
       
        for(int i=1;i<=t;i++)
        {
         a[i]=ob.nextInt();
        }
        for (int i=1;i<b.length;i++)
        {
            b[i]=(a[i]*(r-1))/(((int)Math.pow(r, i))-1);
            if(a[i]==((((b[i])*((Math.pow(r, i))-1)))/(r-1)))
            {
                System.out.println(b[i]);
            }
            else
            {
            continue;
            }
            } 
        }
    }