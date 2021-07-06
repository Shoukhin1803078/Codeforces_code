package codeforces;

import java.util.Scanner;

public class Codeforces50A {

    public static void main(String[] args) {
        int M, N;
        Scanner ob = new Scanner(System.in);
        
            M = ob.nextInt();
            N = ob.nextInt();
            int domino_area = 2 * 1;
            int table_area = M * N;
            System.out.println((table_area / domino_area));
        

    }
}
