package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass15 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        for (int T = 1; T <= t; T++) {
        int n=ob.nextInt();
       String s=ob.next();
      // for(int i=0;i<n;i++){
           for(int j=0;j<n-1;j++)
           {
           if((s.charAt(j))=='1'&&(s.charAt(j+1)=='0'))
           {
           s.replace(s.charAt(j), '0');
               System.out.println(s);
           }
           }
           //}
           
       //     System.out.println(s);
        }
   

    }
}
