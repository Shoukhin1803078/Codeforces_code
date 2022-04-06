

import java.util.*;

public class NewClass_1644_A{

	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
	
			String s=ob.next();
			Map<Character,Integer> mp=new HashMap();
			mp.put('r',0);
			mp.put('b',0);
			mp.put('g',0);
			
			for(int i=0;i<s.length();i++){
				mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
      }

  }
		
}
