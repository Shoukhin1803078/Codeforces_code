
package codeforces;

import java.util.Scanner;

public class codeforces71A {
    public static void main(String[] args) {
        int T;
        Scanner ob=new Scanner (System.in);
        T=ob.nextInt();
        for(int t=1;t<=T;t++ )
        {
        String s;
        s=ob.next();
        if(s.length()>10)
        {
            System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
        }
        else
        {
            System.out.println(s);
        }
        }
    }
}
