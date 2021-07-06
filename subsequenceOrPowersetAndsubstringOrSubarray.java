
package codeforces;

import java.util.Scanner;

public class subsequenceOrPowersetAndsubstringOrSubarray {
    public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	String s=ob.next();
	for(int i=0;i<s.length();i++)
	{
		for(int j=i;i<s.length();i++)
		{
			System.out.println(s.substring(i, j));
		}
	}
	}
}
