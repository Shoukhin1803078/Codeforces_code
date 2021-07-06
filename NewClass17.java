package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass17 {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		Vector v=new Vector();
		for (int i=0; i<n; i++) {
			int x=ob.nextInt();
			v.add(x);
		}

		Vector v1=new Vector();
		for (int i=0; i<v.size()-1; i++) {
			int y=(int) Math.abs((int) v.get(i)-(int) v.get(i+1));
			v1.add(y);
		}
		v1.add((int) Math.abs(((int) v.get(v.size()-1))-((int) v.get(0))));                         //   v1.add((int) Math.abs((int) v.get(v.size() - 1) - (int) v.get(0)));
		// System.out.println(v1);
		int min=0;

		for (int i=1; i<v1.size(); i++) {
			if ((int) v1.get(min)>(int) v1.get(i)) {
				min=i;
			}
		}
		//    System.out.println("Min="+min);
		if (min==((int) v1.size()-1)) {
			System.out.println(((int) v.size())+" "+1);
		}
		else {
			if (min==0) {
				System.out.println((min+1)+" "+(min+1+1));
			}
			else {
				System.out.println((min+1)+" "+(min+1+1));
			}
		}

	}
}
