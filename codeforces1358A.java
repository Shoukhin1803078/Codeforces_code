
package codeforces;

import java.util.Scanner;

public class codeforces1358A {
    public static void main(String[] args) {
        int T;
        Scanner ob=new Scanner (System.in);
        T=ob.nextInt();
        for(int i=0;i<T;i++)
        {
            int n ,m;
        n=ob.nextInt();
        m=ob.nextInt();
            System.out.println(((n*m)+1)/2);
        }
    }
}