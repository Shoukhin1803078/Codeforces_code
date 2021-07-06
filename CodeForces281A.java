package codeforces;
import java.util.Scanner;
public class CodeForces281A {
    public static void main(String[] shoukhin)
    {
            String s;
            Scanner ob = new Scanner(System.in);
            s=ob.nextLine();
            char a[] = new char[s.length()];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.charAt(i);
            }
            for (int i = 'a'; i <= 'z'; i++) {
                if (a[0] == i) {
                    char c = a[0];
                    int i1 = (int) c;// Suppose c=98   i1=98  i1=i1-32=66 ati 'B' er ASCII value 
                    i1 = i1 - 32;
                    a[0] = (char) i1;
                } else {
                    continue;
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
    }
}