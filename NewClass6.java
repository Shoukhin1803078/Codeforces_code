package codeforces;

import java.util.Scanner;

public class NewClass6 {

    public static void main(String[] args) {
        int n;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        for (int i = 0; i < n; i++) {
            String s;
            s = ob.next();
            int l = s.length();
            if (l <= 2) {
                System.out.println(s);
            } else {
                int k = 0;
                for (int j = 0; j < l; j++) {
                    char c = s.charAt(j);
                    for (int z = 0; z < l; z++) {
                        if (c == s.charAt(z)) {
                            k = 0;
                            break;
                        } else {
                            k++;
                        }
                    }
                    if (k == 0) {
                        System.out.print(s.charAt(0));
                        for (int m = 1; m <= (l - 2) / 2; m++) {
                            System.out.print(s.charAt(m));
                        }
                        System.out.println(s.charAt(l - 1));
                        break;
                    }
                }
            }
        }
    }
}
