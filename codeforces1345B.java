package codeforces;
import java.util.Scanner;
public class codeforces1345B {
    public static void main(String[] args) {
        int t;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        for(int T = 1; T <= t; T++) {
            int n;
            n = ob.nextInt();
            int k = 0;
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
            int x = i * 2 + (i - 1);
                sum=sum+x;
                 if(sum>n)
                 { break;}
                System.out.println(sum);
       
            }
            System.out.println(k);
            sum = 0;
            k = 0;
        }
    }
}