package codeforces;

import java.util.Scanner;

public class Codeforces59A {

              public static void main(String[] args) {
                            Scanner ob = new Scanner(System.in);
                            String s = ob.next();
                            char ch;
                            int k = 0, l = 0;
                            for (int i = 0; i < s.length(); i++) {
                                          ch = s.charAt(i);
                                          for (char c = 'a'; c <= 'z'; c++) {
                                                        if (ch == c) {
                                                                      k++;
                                                        }
                                          }
                                          for (char c = 'A'; c <= 'Z'; c++) {
                                                        if (ch == c) {
                                                                      l++;
                                                        }
                                          }
                            }
                            if (k > l) {
                                          System.out.println(s.toLowerCase());
                            } else if (k == l) {
                                          System.out.println(s.toLowerCase());
                            } else {
                                          System.out.println(s.toUpperCase());
                            }
              }
}
