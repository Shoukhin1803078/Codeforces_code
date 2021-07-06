package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass16 {

                 public static void main(String[] args) {
                                  Scanner ob = new Scanner(System.in);
                                  long n = ob.nextLong();
                                  if (n % 2 == 0) {
                                                   long count = n / 2;
                                                   long oddsum = count * count;  // n songkhok odd number er sum = n squire
                                                   long evensum = count * (count + 1);                // n songkhok even number er sum= n(n+1)
                                                   System.out.println(evensum - oddsum);
                                  } else {
                                                   long   count1=n/2;//even er jonno
                                                   long   count2=n/2+1;//odd er jonno
                                                   long oddsum = count2 * count2;  
                                                   long evensum = count1 * (count1 + 1);               
                                                   System.out.println(evensum - oddsum);
                                  }

                 }
}
