
package codeforces;

import java.util.Scanner;

public class Codeforces112A {
    public static void main(String[] args) {
        String s1, s2;
        Scanner ob = new Scanner(System.in);
        s1 = ob.nextLine();
        s2 = ob.nextLine();
        String s3=s1.toUpperCase();
        String s4=s2.toUpperCase();
        char c3=0;
        char c4=0;
        for (int i=0;i<s3.length();i++)
        {
        char c1=s3.charAt(i);
        char c2=s4.charAt(i);
        if(c1!=c2)
        {
        c3=c1;
        c4=c2;
        break;
        }
        }
       // System.out.println(c3+" "+c4);
        if(c3>c4)
        {
            System.out.println(1);
        }
        else if(c3<c4)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(0);
        }
    }
}
