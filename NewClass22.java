package codeforces;
import java.util.Scanner;
import java.util.Vector;
public class NewClass22 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        for (int T = 1; T <= t; T++) {
            int n = ob.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Math.abs(ob.nextInt());
            }
            for(int i=0;i<n;i+=2){a[i]=-a[i];}
             for(int i=0;i<n;i++)
             {System.out.print(a[i]+" ");}
             System.out.println();

        }

    }
}
