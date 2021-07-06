package codeforces;

import java.util.Scanner;

public class NewClass12 {

                 public static void main(String[] args) {

                                  Scanner ob = new Scanner(System.in);

                                  int t;
                                  t = ob.nextInt();
                                  for (int T = 1; T <= t; T++) {
                                                   int n = ob.nextInt();
                                                   int a[] = new int[n];
                                                   for (int i = 0; i < n; i++) {
                                                                    a[i] = ob.nextInt();
                                                   }
                                                   int m = 0;
                                                   for (int i = 0; i < n; i++) {
                                                                    for (int j = i + 1; j < n; j++) {
                                                                                     if (a[i] == a[j]) {
                                                                                                      m = 1;
                                                                                                      break;
                                                                                     }
                                                                    }

                                                   }
                                                   if (m == 1) {
                                                                    System.out.println("NO");
                                                   } else {
                                                                    int ans1 = 0;
                                                                    int ans2 = 0;
                                                                    int ans3 = 0;
                                                                    int k1 = 0;
                                                                    for (int i = 0; i < n - 2; i++) {
                                                                                     int j = i + 1;
                                                                                     int k = j + 1;
                                                                                     if ((a[j] > a[i]) && (a[j] > a[k])) {
                                                                                                      //   System.out.println("YES");
                                                                                                      k1 = 1;
                                                                                                      // System.out.println((i+1) + " " + (j+1) + " " + (k+1) + " ");
                                                                                                      ans1 = i + 1;
                                                                                                      ans2 = j + 1;
                                                                                                      ans3 = k + 1;
                                                                                                      break;
                                                                                     }
                                                                    }
                                                                    if (k1 == 1) {
                                                                                     System.out.println("YES");
                                                                                     System.out.println(ans1 + " " + ans2 + " " + ans3 + " ");
                                                                    } else {
                                                                                     System.out.println("NO");
                                                                    }

                                                   }
                                  }
                 }
}
