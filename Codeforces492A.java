package codeforces;

import java.util.Scanner;

public class Codeforces492A {

     public static void main(String[] args) {
        int n;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        if(n==1)
        {
            System.out.println(1);
        }
        else
        {
        int sum = 0;
        int total[] = new int[(int) Math.pow(10, 4)];
        for (int i = 1; i <= n; i++) //i holo level number 
        {
            sum = (i * (i + 1)) / 2;
            total[i] = sum;
        }
        total[0] = 0;
        int k = 0;
        for (int i = 1; i < total.length; i++) {
            total[i] = total[i - 1] + total[i];
            if (total[i] > n) {
                break;
            } 
            else
            {
            k++;
            }
        }
        System.out.println(k);
        }
        
    }
}
