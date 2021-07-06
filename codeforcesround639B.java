package codeforces;
import java.util.Scanner;
public class codeforcesround639B {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int T;
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {
            int sum = 0;
            int n;
            int k1 = 0;
            int k = 0;
            n = ob.nextInt();
            int l = 0;
            if (n == 1) {
                System.out.println(0);
                System.exit(0);
            } else {
                for (int j = 1; j <= 100000; j++) {
                    int x = (j * 2) + (j - 1);
                    sum = sum + x;
                    if (sum == n) {
                        l = 0;
                        System.out.println(1);
                        break;
                    } else if (sum > n) {
                        break;
                    }
                    l = 1;
                    k++;
                }
                if (l == 0) {
                } else {
                    System.out.println(k);
                }
                sum = 0;
                k = 0;
            }
        }
    }
}