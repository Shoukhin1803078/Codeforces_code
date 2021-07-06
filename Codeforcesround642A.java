package codeforces;

import java.util.Scanner;

public class Codeforcesround642A {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int T;
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {
            int n, m;
            n = ob.nextInt();
            m = ob.nextInt();
        if(n==1)
        {
            System.out.println(0);
        }else if(n==2)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println(2*m);
        }
        
        }
    }
}
