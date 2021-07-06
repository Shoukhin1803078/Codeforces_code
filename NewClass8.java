/******************************************************************************
 
In the name of Allah , the most gracious , the most merciful.
 
*******************************************************************************/
package codeforces;

import java.util.Scanner;

public class NewClass8 {
    public static void main(String[] args) {
        Scanner ob=new Scanner (System.in);
        int n=ob.nextInt();
        for(int t=0;t<n;t++)
        {
            int c1=0,c2=0;
        
        for(int i=0;i<n;i++)
        {
        int a;
        a=ob.nextInt();
        if(((i%2)==1)&&((a%2)==0)) {c1++;}
        else if(((i%2)==0)&&((a%2)==1)) {c2++;}
        }
        if(c1==c2){System.out.println((c1+c2)/2);}
        else{System.out.println(-1);}
        }
    }
}
