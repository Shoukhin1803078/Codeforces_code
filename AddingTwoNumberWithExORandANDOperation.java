package codeforces;

import java.util.Scanner;

public class AddingTwoNumberWithExORandANDOperation {

              public static void main(String[] args) {
                            Scanner ob = new Scanner(System.in);
                            int A = ob.nextInt();
                            int B = ob.nextInt();
                            int x = A ^ B;
                            int y = A & B;
                            if (y == 0) {
                                          System.out.println(x);
                            } else {
                                          while (y != 0) {
                                                        y = y << 1;
                                                        x = x ^ y;
                                          }
                                          System.out.println(x);
                            }

              }
}
