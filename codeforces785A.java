package codeforces;
import java.util.Scanner;
public class codeforces785A {
    public static void main(String[] alamin) {
        int x;
        String s;
        int sum = 0;
        Scanner ob = new Scanner(System.in);
            x = ob.nextInt();
            for (int i = 0; i < x+1; i++) {
                s = ob.nextLine();
                if (s.equals("Cube")) {
                    sum = sum + 6;
                } else if (s.equals("Tetrahedron")) {
                    sum = sum + 4;
                } else if (s.equals("Octahedron")) {
                    sum = sum + 8;
                } else if (s.equals("Dodecahedron")) {
                    sum = sum + 12;
                } else if (s.equals("Icosahedron")) {
                    sum = sum + 20;
                }
            }
           System.out.println(sum);
        sum=0;
    }
}