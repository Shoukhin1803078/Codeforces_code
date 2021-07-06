package codeforces;
import java.util.Scanner;
public class codeforces1365B {
    public static void main(String[] args) {
        int t;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        for (int T = 0; T < t; T++) {
            int n;
            n = ob.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = ob.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                if ((a[i] > a[i + 1])) {
                    if (b[i] != b[i + 1]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        int temp1=b[i];
                        b[i]=b[i+1];
                        b[i+1]=temp1;
                    }
                }
            }

            int k = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    k = 1;
                    break;
                } else {
                    k = 0;
                }
            }
            if (k == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}