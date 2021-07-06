package codeforces;

import java.util.Scanner;

public class NewClass3 {

                 public static void main(String[] args) {
                                  int T;
                                  Scanner ob = new Scanner(System.in);
                                  T = ob.nextInt();
                                  out:for (int t = 1; t <= T; t++) {
                                                   int a = 0, b = 0, c;
                                                   int l, r;
                                                   double m;
                                                   l = ob.nextInt();
                                                   r = ob.nextInt();
                                                   m = ob.nextDouble();

                                                   if (l > r) {
                                                                    a = l;
                                                                    b = r;
                                                                    if (a - b == 1) {
                                                                                     c = a;
                                                                                     for (int n = 1; n <= 100000; n++) {
                                                                                                      if (((n * a) + b - c) == m) {
                                                                                                                       System.out.println(a + " " + b + " " + c + " ");
                                                                                                                      continue out;
                                                                                                      }

                                                                                     }
                                                                                     c = b;
                                                                                     for (int n = 1; n <= 100000; n++) {
                                                                                                      if (((n * a) + b - c) == m) {
                                                                                                                       System.out.println(a + " " + b + " " + c + " ");
                                                                                                                       continue out;
                                                                                                      }

                                                                                     }

                                                                    } else if ((a - b) > 1) {
                                                                                     for (c = Math.min(a, b); c < Math.max(a, b); c++) {
                                                                                                      for (int n = 1; n <= 100000; n++) {
                                                                                                                       if (((n * a) + b - c) == m) {
                                                                                                                                        System.out.println(a + " " + b + " " + c + " ");
                                                                                                                                      continue out;
                                                                                                                       }

                                                                                                      }
                                                                                     }
                                                                    }

                                                   } else {
                                                                    a = l;
                                                                    b = r;
                                                                    if (b - a == 1) {
                                                                                     c = b;
                                                                                     for (int n = 1; n <= 100000; n++) {
                                                                                                      if (((n * a) + b - c) == m) {
                                                                                                                       System.out.println(a + " " + b + " " + c + " ");
                                                                                                                         continue out;
                                                                                                      }

                                                                                     }
                                                                                     c = a;
                                                                                     for (int n = 1; n <= 100000; n++) {
                                                                                                      if (((n * a) + b - c) == m) {
                                                                                                                       System.out.println(a + " " + b + " " + c + " ");
                                                                                                                     continue out;
                                                                                                      }

                                                                                     }

                                                                    } else if ((b - a) > 1) {
                                                                                     for (c = Math.min(a, b); c < Math.max(a, b); c++) {
                                                                                                      for (int n = 1; n <= 100000; n++) {
                                                                                                                       if (((n * a) + b - c) == m) {
                                                                                                                                        System.out.println(a + " " + b + " " + c + " ");
                                                                                                                                  continue out;
                                                                                                                       }

                                                                                                      }
                                                                                     }
                                                                    }

                                                   }

                                  }
                 }
}
