package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass21 {
      static void powerSet(Vector v1) {
                                  Vector v2 = new Vector();
                                  int k = 0;
                                  int sum = 0;
                                  for (int i = 0; i < 1 << v1.size(); i++) {
                                                   for (int j = 0; j < v1.size(); j++) {
                                                                    if ((i & (1 << j)) != 0) {
                                                                                     //   System.out.print(v1.get(j) + " ");
                                                                                     sum = sum | ((int) v1.get(j));
                                                                    }
                                                   }
                                                   v2.add(sum);
                                                   sum = 0;
                                                   //  System.out.println();

                                  }
                                  Vector v3 = new Vector();

                                  for (int i = 0; i < v2.size(); i++) {
                                                   int x = (int) v2.get(i);
                                                   if (v3.contains(x)) {
                                                                    k++;
                                                                    break;
                                                   } else {
                                                                    v3.add(x);
                                                   }
                                  }
                                  // System.out.println(v3);      
                                  //System.out.println(v2);
                                  if (v3.size() == v2.size()) {
                                                   System.out.println("YES");
                                  } else {
                                                   System.out.println("NO");
                                  }

                 }

           
                 public static void main(String[] args) {
                                  //try{
                                  Scanner ob = new Scanner(System.in);
                                  int t = ob.nextInt();
                                  for (int T = 1; T <= t; T++) {
                                                   Vector v = new Vector();
                                                   int n = ob.nextInt();
                                                   for (int i = 0; i < n; i++) {
                                                                    int x = ob.nextInt();
                                                                    v.add(x);
                                                   }
                                                   powerSet(v);

                                  }
                               //   }
                             /*     catch(Exception e){
                                                   System.out.println("Exception dhora porese");
                                  } */
                                  
                 }
}
