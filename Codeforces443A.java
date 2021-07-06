package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces443A {

    public static void main(String[] shoukhin) {
        char x;
        Scanner ob = new Scanner(System.in);
        char arr[] = new char[1000];
        for (int i = 0; i < arr.length; i++) {
            x = ob.next().charAt(0);
            if (x == '}') {
                break;
            } else {
                arr[i] = x;
            }
        }
        int k = 0;
        int m = 0;
        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int j = 0; j < arr.length; j++) {
                if (c == arr[j]) {
                    k++;
                }
            }
            if (k > 1) {
                sum++;
            } else if (k == 1) {
                sum++;
            }
           System.out.println(c + "=" + k);
            k = 0;
        }
        System.out.println(sum);
    }
}