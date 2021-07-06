package codeforces;
import java.util.Scanner;
public class codeforces1350A {
    public static void main(String[] args) {
        int T;
        Scanner ob = new Scanner(System.in);
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {
            int n, k;
            n = ob.nextInt();
            k = ob.nextInt();
            int ans = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    ans = i;
                    break;
                }
            }
            n = n + ans;
            n = n + 2 * (k - 1);
            System.out.println(n);
        }
    }
}