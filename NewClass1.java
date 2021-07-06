package codeforces;

import java.util.*;
import java.lang.*;

public class NewClass1 {

	public static void main(String[] sho) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int n=sc.nextInt();
			long sum=0;
			int one=0;
			int sone=0;
			int two=0;
			int stwo=0;
			Vector<Integer> v=new Vector();
			for (int i=0; i<n; i++) {
				int x=sc.nextInt();
				if (x==2) {
				two++;	
				}
				sum+=x;
			}
			if(sum%2==1){System.out.println("NO");}
			else if(n==two&&n%2==1){System.out.println("NO");}
			else{System.out.println("YES");}
		}
	}
}
