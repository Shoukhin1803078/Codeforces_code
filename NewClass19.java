package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass19 {
//  static int n;

                    static boolean a[] = new boolean[100000];

                    public static void main(String[] args) {
                                        Scanner ob = new Scanner(System.in);
                                        int x = ob.nextInt();
                                        int y = ob.nextInt();
                                        int n = 100;
                                        Vector v = new Vector();
                                        for (int i = 0; i <= n; i++) {
                                                            a[i] = true;
                                        }
                                        for (int i = 2; i <= n; i += 2) {
                                                            a[i] = false;
                                        }
                                        for (int i = 3; i < Math.sqrt(n); i++) {
                                                            if (a[i] == true) {
                                                                                for (int j = i * i; j <= n; j = j + i) {
                                                                                                    a[j] = false;
                                                                                }
                                                            }
                                        }
                                        v.add(2);
                                        for (int i = 2; i <= n; i++) {
                                                            if (a[i] == true) {
                                                                                v.add(i);
                                                            }
                                        }
                                        //solve 
                                        int k = 0;
                                        for (int i = 0; i < v.size(); i++) {
                                                            if (x == (int) v.get(i) && y == (int) v.get(i + 1)) {
                                                                                k = 1;
                                                                                break;
                                                            }
                                        }
                                        if (k == 1) {
                                                            System.out.println("YES");
                                        } else {
                                                            System.out.println("NO");

                                        }

                    }
}
