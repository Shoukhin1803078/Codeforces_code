
package codeforces;

import java.util.Scanner;

public class NewClass23 {
    static int ADD(int x,int y)
    {
    while(y!=0)
    {
    int carry=x&y;
    x=x^y;
    y=carry<<1;
    }
    return x;
    }
     public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int A = ob.nextInt();
        int B = ob.nextInt();
        // System.out.println(ADD(A,B));
     while(B!=0)
     {
     int carry=A&B;
     A=A^B;
     B=carry<<1;
     }
         System.out.println(B);
     }
}
