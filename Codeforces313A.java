/* Ilay Bank account */
package codeforces;
import java.util.Scanner;
public class Codeforces313A {
        public static void main(String[] args) {
        int n, x, y = 0;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        if (n > 0) {
            System.out.println(n);
        } else {
            int last_digit = n % 10;
            int temp1 = n;
            int temp2 = n / 10;
            int temp3 = temp2 / 10;
            int temp4 = (temp3 * 10) + last_digit;
            if (temp2 > temp4) {
                System.out.println(temp2);
            } else {
                System.out.println(temp4);
            }
        }
    }
}