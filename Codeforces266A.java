/*Stone on the table*/
package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces266A {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n;
        n = ob.nextInt();
        String s;
        s = ob.next();
        ArrayList a = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            a.add(i, c);
        }

        int k = 0;
        for (int i = 0; i < a.size(); i++) {

            if (i == (a.size() - 1)) {
                break;
            } else if (a.get(i + 1) == a.get(i)) {
                k++;
            }
        }
        System.out.println(k);

    }
}
