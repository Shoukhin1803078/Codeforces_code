package codeforces;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class CodeForces {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while (t-->0) {
			int n=ob.nextInt();
			int a[]=new int[n];
			int v[]=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=ob.nextInt();
			}
			//long max=0;
			long max=0;
			for (int i=n-1; i>=0; i--) {
				if (i+a[i]<n) {
					a[i]+=a[i+a[i]];
				}
				max=Math.max(max, a[i]);
			}
		}
	}
}
