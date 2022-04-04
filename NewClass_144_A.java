/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class NewClass_144_A{

	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		Vector<Integer> v=new Vector();
		int tt=ob.nextInt();
		out:
		for(int t=0;t<tt;t++){
			int s=ob.nextInt();
			v.add(s);
		}
		int i=(v.lastIndexOf(Collections.min(v)))+1;
		int j=v.indexOf(Collections.max(v))+1;
		//System.out.println(i+" "+j);
		if(i<j){
			System.out.println((j-1)+(v.size()-i)-1);
		}else{
			System.out.println((j-1)+(v.size()-i));
		}

	}
}
