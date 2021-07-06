
package codeforces;  
import java.util.ArrayList;
import java.util.Scanner;
public class educationalround86B {
     public static void main(String[] args) {
        int t;
        Scanner ob = new Scanner(System.in);
        t = ob.nextInt();
        for (int T = 1; T <= t; T++) {
            String s;
            s=ob.next();
            ArrayList a=new ArrayList();
           int x=1,y=2,z=3;
            for(int i=0;i<s.length();i++)
            {
            for(int j=i+1;j<s.length();j++)
            {
               a.add(s.substring(i,j));  
            }
            }
            
        }
    }
}
