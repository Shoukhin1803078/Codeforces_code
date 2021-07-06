package codeforces;

public class digit {

    static int firstdigit(int n) {
        while (n > 10) {
            n = n / 10;
        }
        return n;
    }

    static int occurance(int n, int d) {
        int count = 0;
        while (n > 0) {
            if (d == n % 10) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 633356778;
        System.out.println("last digit:" + n % 10);
        System.out.println("First digit:" + firstdigit(n));
        //which digit repeated how many?
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "ase " + occurance(n, i) + "ber");
        }
    }
}
