package codeforces;
import java.util.*;
import java.io.*;
public class ImportantMethod {
    static Scanner ob= new Scanner (System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int ni()throws IOException{return ob.nextInt();}
    static long nl()throws IOException{return ob.nextLong();}
    static int[][] nai2(int n,int m)throws IOException{int a[][] = new int[n][m];for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j] = ni();return a;}
    static int[] nai(int N,int start)throws IOException{int[]A=new int[N+start];for(int i=start;i!=(N+start);i++){A[i]=ni();}return A;}
    static Integer[] naI(int N,int start)throws IOException{Integer[]A=new Integer[N+start];for(int i=start;i!=(N+start);i++){A[i]=ni();}return A;}
    static long[] nal(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=nl();}return A;}
    static void print(int arr[]){for(int i=0;i<arr.length;i++)out.print(arr[i]+" ");out.println();}
    static void print(long arr[]){for(int i=0;i<arr.length;i++)out.print(arr[i]+" ");out.println();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));} // return the number of set bits.
    static boolean isPrime(int number){if(number==1) return false;if (number == 2 || number == 3){return true;}if (number % 2 == 0) {return false;}int sqrt = (int) Math.sqrt(number) + 1;for(int i = 3; i < sqrt; i += 2){if (number % i == 0){return false;}}return true;}
    static boolean isPrime(long number){if(number==1) return false;if (number == 2 || number == 3){return true;}if (number % 2 == 0) {return false;}long sqrt = (long) Math.sqrt(number) + 1;for(int i = 3; i < sqrt; i += 2){if (number % i == 0){return false;}}return true;}
    static int power(int n,int p){if(p==0)return 1;int a = power(n,p/2);a = a*a;int b = p & 1;if(b!=0){a =  n*a;}return a;}
    static long power(long n,long p){if(p==0)return 1;long a = power(n,p/2);a = a*a;long b = p & 1;if(b!=0){a =  n*a;}return a;}
    static void reverse(int[] a) {int b;for (int i = 0, j = a.length - 1; i < j; i++, j--) {b = a[i];a[i] = a[j];a[j] = b;}}
    static void reverse(long[] a) {long b;for (int i = 0, j = a.length - 1; i < j; i++, j--) {b = a[i];a[i] = a[j];a[j] = b;}}
    static void swap(int a[],int i,int j){a[i] = a[i] ^ a[j];a[j] = a[j] ^ a[i];a[i] = a[i] ^ a[j];}
    static void swap(long a[],int i,int j){a[i] = a[i] ^ a[j];a[j] = a[j] ^ a[i];a[i] = a[i] ^ a[j];}
    static int count(int n){int c=0;while(n>0){c++;n = n/10;}return c;}
    static int[] prefix_sum(int a[],int n){int s[] = new int[n];s[0] = a[0];for(int i=1;i<n;i++){s[i] = a[i]+s[i-1];}return s;}
    static long[] prefix_sum_int(int a[],int n){long s[] = new long[n];s[0] = (long)a[0];for(int i=1;i<n;i++){s[i] = ((long)a[i])+s[i-1];}return s;}
    static long[] prefix_sum_Integer(Integer a[],int n){long s[] = new long[n];s[0] = (long)a[0];for(int i=1;i<n;i++){s[i] = ((long)a[i])+s[i-1];}return s;}
    static long[] prefix_sum_long(long a[],int n){long s[] = new long[n];s[0] = a[0];for(int i=1;i<n;i++){s[i] = a[i]+s[i-1];}return s;}
    static boolean isPerfectSquare(double x){double sr = Math.sqrt(x);return ((sr - Math.floor(sr)) == 0);}
    static ArrayList<Integer> sieve(int n) {int k=0; boolean prime[] = new boolean[n+1];ArrayList<Integer> p_arr = new ArrayList<>();for(int i=0;i<n;i++) prime[i] = true;for(int p = 2; p*p <=n; p++){ k=p;if(prime[p] == true) { p_arr.add(p);for(int i = p*2; i <= n; i += p) prime[i] = false; } }for(int i = k+1;i<=n;i++){if(prime[i]==true)p_arr.add(i);}return p_arr;} 
    static boolean[] seive_check(int n) {boolean prime[] = new boolean[n+1];for(int i=0;i<n;i++) prime[i] = true;for(int p = 2; p*p <=n; p++){ if(prime[p] == true) { for(int i = p*2; i <= n; i += p) prime[i] = false; } }prime[1]=false;return prime;} 
    static int get_bits(int n){int p=0;while(n>0){p++;n = n>>1;}return p;}
    static int get_bits(long n){int p=0;while(n>0){p++;n = n>>1;}return p;}
    static int get_2_power(int n){if((n & (n-1))==0)return get_bits(n)-1;return -1;}
    static int get_2_power(long n){if((n & (n-1))==0)return get_bits(n)-1;return -1;}
    static void close(){out.flush();}
                 public static void main(String[] args) {
                                  int x=ob.nextInt();
                                  System.out.println(isPrime(x));
                 }
 
}
