package codeforces;
import java.util.Scanner;
public class codeforce1359A {
    public static void main(String[] args) {
        int T;
        Scanner ob = new Scanner(System.in);
        T = ob.nextInt();
        for (int t = 1; t <= T; t++) {
            int n, m, k;
            n = ob.nextInt();
            m = ob.nextInt();
            k = ob.nextInt();
            int each=n/k;
            if (each>=m) {
                System.out.println(m);
             //   continue;
            } 
            System.out.println(each-(int)Math.ceil((m-(n/k))/(k-1)));
         //   int remainingCard =m-n/k;
         //   int remaingPlayer=k-1;
           // System.out.println(each-(int)Math.ceil(remainingCard/ remaingPlayer));
        }
    }
}