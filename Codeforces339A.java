package codeforces;

import java.util.Scanner;

public class Codeforces339A {

      public static void main(String[] args) {
        String s;
        Scanner ob = new Scanner(System.in);
        s = ob.next();
        char a[] = s.toCharArray();
        for (int i = 2; i < a.length; i++) {
            char temp = a[i];
            for (int j = i - 2; j >= 0; j = j - 2) {
                if (temp < a[j]) {
                    j = j + 2;
                    a[j] = a[j - 2];
                    a[j - 2] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        
        
    }
}