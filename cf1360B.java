package codeforces;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class cf1360B {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        for (int T = 1; T <= t; T++) {
            int n = ob.nextInt();
            if(n==2)
            {
            int a1=ob.nextInt();
            int a2=ob.nextInt();
                System.out.println(Math.abs(a1-a2));
            }
            else
            {
              Integer a[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }
            Arrays.sort(a);
            Vector v = new Vector();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    v.add(Math.abs(a[i] - a[j]));
                }
            }
            int min = (int) v.get(0);
            for (int i = 1; i < v.size(); i++) {
                if ((int) v.get(i) < min) {
                    min = (int) v.get(i);
                }
            }
            System.out.println(min);
            }
        }
    }
}