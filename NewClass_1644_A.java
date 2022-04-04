/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

import java.util.*;

public class NewClass_1644_A{

	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		int tt=ob.nextInt();
		out:for(int t=0;t<tt;t++){
			String s=ob.next();
			Vector<Character> v=new Vector();
			//System.out.println(v);
			for(int j=0;j<s.length();j++){
				v.add(s.charAt(j));
				//System.out.println(v);
				char c=s.charAt(j);
				if(c=='R'){
					if(!v.contains('r')){
						System.out.println("NO");
						continue out;
					}
				}
				else if(c=='B'){
					if(!v.contains('b')){
						System.out.println("NO");
						continue out;
					}
				}
				else if(c=='G'){
					if(!v.contains('g')){
						System.out.println("NO");
						continue out;
					}
				}
			}
			System.out.println("YES");
		}
	}
}
