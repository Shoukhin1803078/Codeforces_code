package codeforces;
import java.util.ArrayList;
import java.util.Scanner;
public class Codeforces1328A {
public static void main(String[] args) {
        int n, a, b, z;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        int array[] = new int[n];
        for (int i=0;i<n;i++)
        {
        a = ob.nextInt();
        b = ob.nextInt();
        if(a%b==0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(b-(a%b));
        }
        }  
}
}