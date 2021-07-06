package codeforces;
import java.util.Random;
import java.util.Scanner;
public class contestA {
    public static void main(String[] args) {
        int  n, a, b, c, d;
        long x,y,z,s;
        float area;
        Scanner ob = new Scanner(System.in);
        Random rand = new Random();
        n = ob.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                a = ob.nextInt();
                b = ob.nextInt();
                c = ob.nextInt();
                d = ob.nextInt();
                x = rand.nextInt((b-a)+1) + a;
                y = rand.nextInt((c-b)+1) + b;
                z = rand.nextInt((d-c)+1) + c;
                
                if ((x + y) > z) {
                    s = ((x + y + z) / 2);
                    area = (float) Math.sqrt(((s) * (s - x) * (s - b) * (s - c)));
                    if (area > 0) {
                        System.out.println(x + " " + y + " " + z);
                    }
                    break;
                } else if ((y + z) > x) {
                    s = ((x + y + z) / 2);
                    area = (float) Math.sqrt(((s) * (s - x) * (s - b) * (s - c)));
                    if (area > 0) {
                        System.out.println(x + " " + y + " " + z);
                    }
                    break;
                } else if ((z + x) > y) {
                    s = ((x + y + z) / 2);
                    area = (float) Math.sqrt(((s) * (s - x) * (s - b) * (s - c)));
                    if (area > 0) {
                        System.out.println(x + " " + y + " " + z);
                    }
                    break;
                }
            }
        }
    }
}