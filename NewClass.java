package codeforces;

import java.util.*;

public class NewClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println(0%1);
		int T=sc.nextInt();
		for (int t=0; t<T; t++) {

			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if ((a%2!=0)&&((b%2!=0))&&c>1) {
				System.out.println("NO");
			}
			else if(((a%2!=0)&&((b%2!=0))&&c==1)){System.out.println("YES");}
			else if(((a%2==0)&&((b%2==0))&&)){System.out.println("YES");}
			else {
				if ((a%2==0)&&(b%2!=0)) {
				if(a>=c){System.out.println("YES");}
				else{System.out.println("NO");}
				}
				else if ((a%2!=0)&&(b%2==0)) {
					if(b>=c){System.out.println("YES");}
				else{System.out.println("NO");}
				}
				else {
					int x=a+b;
					if(x>=c){System.out.println("YES");}
				else{System.out.println("NO");}
				}
			}
		}
	}
}
