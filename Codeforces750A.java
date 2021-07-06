package codeforces;

import java.util.Scanner;

public class Codeforces750A {

    public static int time_needed() {
        return 5;
    }

    public static void main(String[] shoukhin) {
        int n, k, m;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        k = ob.nextInt();
        m = 240 - k;

        // n ti problem solve korte time lagbe :
        //avabeo hobe 
        // int temp1=1;
        // for (int i=1;i<=n;i++)
        //{
        // for(int j=1;j<=i;j++)
        //{
        //temp1=5*i;
        //}
        //sum=sum+temp1;
        //}
        // n ti problem solve korte time lagbe :5+10+15+20+25+...
        int a = 5, d = 5;
        int sum = (int) ((n / 2.0) * ((2 * a) + ((n - 1) * d)));

      //  System.out.println("sufficient time= " + m + "\ntime needed to solve " + n + " ti problems =" + sum);
       // System.out.println("problem solve korte parbe:");
        int temp=0;
        for (int i = 1; i <= n; i++) {
            sum = (int) ((i / 2.0) * ((2 * a) + ((i - 1) * d)));
            if (sum > m) {
                break;
            }
            temp++;
        }
        System.out.println(temp);

    }
}
