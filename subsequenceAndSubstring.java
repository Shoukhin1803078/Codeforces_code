package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class subsequenceAndSubstring {

    static void powerSet(Vector v1) {
        for (int i = 0; i < 1 << v1.size(); i++) {
            for (int j = 0; j < v1.size(); j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(v1.get(j) +" ");
                }
            }
            System.out.println();
        }
    }

    static void subarray(Vector v2) {
        for (int i = 0; i < v2.size(); i++) {
            for (int j = i + 1; j <=v2.size(); j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(v2.get(k));
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Vector v = new Vector();
      Scanner ob=new Scanner (System.in);
      String s=ob.next();
      for(int i=0;i<s.length();i++)
      {
      v.add(s.charAt(i));
      }
        powerSet(v);
        subarray(v);
    }
}
