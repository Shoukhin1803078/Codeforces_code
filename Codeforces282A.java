/*   Bit++   */
package codeforces;
import java.util.Scanner;
public class Codeforces282A {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        int x = 0;
        String s1[] = new String[t];
        for (int i = 0; i < s1.length; i++) {
            String s = ob.next();
            s1[i] = s;
        }
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("X++")) {
                x++;
            } else if (s1[i].equals("++X")) {
                x++;
            } else if (s1[i].equals("--X")) {
                x--;
            } else if (s1[i].equals("X--")) {
                x--;
            }
        }
        System.out.println(x);
    }
}