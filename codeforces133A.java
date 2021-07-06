
package codeforces;

import java.util.Scanner;

public class codeforces133A {
         public static void main(String[] args) {
       String s;
         Scanner ob=new Scanner(System.in);
         s=ob.next();
         for(int i=0;i<s.length();i++)
         {
         if((s.charAt(i)=='H')||(s.charAt(i)=='Q')||(s.charAt(i)=='9'))
         {
             System.out.println("YES");
             System.exit(0);
         }
         }
         System.out.println("NO");
         System.exit(0);
    }
}
