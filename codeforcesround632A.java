package codeforces;
import java.util.Scanner;
public class codeforcesround632A {
    public static void main(String[] shoukhin) {
        int T;
        Scanner ob = new Scanner(System.in);
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {
            int n, m;
            n = ob.nextInt();
            m = ob.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                       if(i==1&&j==1) 
                           System.out.print("W");
			else 
                           System.out.print("B");
                }
                System.out.println();
            }
        }
    }
}