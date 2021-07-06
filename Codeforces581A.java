package codeforces;
import java.util.Scanner;
public class Codeforces581A {
    public static void main(String[] args) {
        int a, b;
        Scanner ob = new Scanner(System.in);
        a = ob.nextInt();
        b = ob.nextInt();
        if(a>b)
        {
         System.out.println(b+" "+(a-b)/2);
        }
          else
        {
         System.out.println(a+" "+(b-a)/2);
        }
    }
}