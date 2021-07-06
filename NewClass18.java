package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass18 {

                    public static void main(String[] args) {
                                        Scanner ob = new Scanner(System.in);
                                        int a[][] = new int[5][5];
                                        for (int i = 0; i < 5; i++) {
                                                            for (int j = 0; j < 5; j++) {
                                                                                a[i][j] = ob.nextInt();
                                                            }
                                        }
                                        int r=0, c=0;
                                        for (int i = 0; i < 5; i++) {
                                                            for (int j = 0; j < 5; j++) {
                                                                                if (a[i][j] == 1) {
                                                                                                    r = i;
                                                                                                    c = j;
                                                                                                    break;
                                                                                }
                                                            }
                                        }
                                        System.out.println((int)Math.abs(2-r)+(int )Math.abs(2-c));
                                        
                                        
                    }
}
