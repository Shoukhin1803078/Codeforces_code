package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass14 {

                 public static void main(String[] shoukhin) {
                                  Scanner ob = new Scanner(System.in);
                                  int t = ob.nextInt();
                                  for (int T = 1; T <= t; T++) {
                                                   int n = ob.nextInt();
                                                   Vector v = new Vector();
                                                   for (int i = 0; i < (2 * n); i++) {
                                                                    int x = ob.nextInt();
                                                                    if (v.contains(x)) {
                                                                                     continue;
                                                                    } else {
                                                                                     v.add(x);
                                                                    }
                                                   }
                                                   for(int i=0;i<v.size();i++)
                                                   {
                                                                    System.out.print(v.get(i)+" ");
                                                   }
                                                   System.out.println();
                                  }
                 }
}
