package codeforces;

import java.util.Scanner;

public class Codeforces750Afinally {

              public static void main(String[] args) {
                            Scanner ob = new Scanner(System.in);
                            int n, k;
                            n = ob.nextInt();
                            k = ob.nextInt();
                            int baki_minute = 240 - k;
                            int a = 5, d = 5;
                            int temp = 0;

                            //total time lgse: 5+10+15+20+30
                            //(n/2.0)(2a+(n-1)d)
                            for (int i = 1; i <= n; i++) {
                                          float s = (((float) i / 2) * ((2 * a) + ((i - 1) * d)));
                                          int sum = (int) s;
                                          if (sum > baki_minute) {
                                                        break;
                                          }
                                          temp++;
                            }
                            System.out.println(temp);

              }

}
