package codeforces;
import java.util.Scanner;
public class codeforcesround642D {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int T;
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {
            int n;

            n = ob.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
             a[i]=0;
            }
           for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for(int k=i;k<j+1;k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
            
        }
    }
}
