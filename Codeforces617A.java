package codeforces;

import java.util.Scanner;

public class Codeforces617A {

            public static void main(String[] args) {
                        int x, y, z;
                        Scanner ob = new Scanner(System.in);
                        x = ob.nextInt();
                        if (x <= 5) {
                                    if (x == 5) {
                                                System.out.println(x / 5);
                                    } else if (x == 4) {
                                                System.out.println(x / 4);
                                    } else if (x == 3) {
                                                System.out.println(x / 3);
                                    } else if (x == 2) {
                                                System.out.println(x / 2);
                                    } else if (x == 1) {
                                                System.out.println(x / 1);
                                    }
                        } else {
                                    int k = 0;
                                    z = x % 5;
                                    if (z == 0) {
                                                System.out.println(x / 5);
                                    } else {
                                                for (int i = 0; i < 10; i++) {
                                                            if (z % 4 == 0) {
                                                                        k++;
                                                                        break;
                                                            } else if (z % 3 == 0) {
                                                                        k++;
                                                                        break;
                                                            } else if (z % 2 == 0) {
                                                                        k++;
                                                                        break;
                                                            } else if (z % 1 == 0) {
                                                                        k++;
                                                                        break;
                                                            }
                                                }
                                                int total = k + (x / 5);
                                                System.out.println(total);
                                    }
                        }
            }
}
