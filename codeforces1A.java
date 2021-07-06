package codeforces;
import java.util.Scanner;
public class codeforces1A {
    static int max = 100000000;
    public static void main(String[] args) {
        long  n, m, a;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        m = ob.nextInt();
        a = ob.nextInt();
        double x1=n*1.0/a;
        double x2=m*1.0/a;
        System.out.println((long)Math.ceil(x1)*(long)Math.ceil(x2));
    }
}