package codeforces;

import java.util.Scanner;

public class Codeforces977A {

            public static int find_last_digit(int m) {
                        return m = m % 10;
            }

            public static void main(String[] args) {
                        int n, k;
                        Scanner ob = new Scanner(System.in);

                        n = ob.nextInt();
                        k = ob.nextInt();
                        for (int i = 0; i < k; i++) {
                                    int m = find_last_digit(n);
                                    if (m == 0) {
                                                n = n / 10;
                                    } else {
                                                n = n - 1;
                                    }
                        }
                        System.out.println(n);
            }
}
