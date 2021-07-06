package codeforces;

import java.util.Scanner;

public class NewClass20 {

                 static int a, b, c, d;

                static void  check(int x) {
                                  x = x + 1;
                                  a = x % 10;
                                  b = (x / 10) % 10;
                                  c = ((x / 10) / 10) % 10;
                                  d = (((x / 10) / 10) / 10) % 10;
                            //      System.out.println(a+" "+b+" "+c+" "+d);
                                  if (a != b && a != c && a != d && b != c && b != d && c != d) 
                                                  System.out.println(x);
                                else
                                                   check(x);
                                 
                                  
                 }

                 public static void main(String[] args) {
                                  Scanner ob = new Scanner(System.in);
                                  int n = ob.nextInt();
                                  check(n);

                 }
}
