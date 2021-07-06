package codeforces;
import java.util.Scanner;
public class CodeForces236A {
    public static void main(String[] args) {
        String s;
        Scanner ob = new Scanner(System.in);
        s = ob.nextLine();
        char a[] = new char[s.length()];
        int k = 0;
        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                    k++;
                }
            }
            //System.out.println(c+"="+k);
            if (k > 1) {
                k = 1;
                sum = sum + k;
            } else {
                sum = sum + k;
            }
            k = 0;
        }
        if(sum%2==0)
        {
        System.out.println("CHAT WITH HER!");
        }
        else
        {
        System.out.println("IGNORE HIM!");
        }
    }
}
