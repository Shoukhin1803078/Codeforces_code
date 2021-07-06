package codeforces;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Vector;
import java.lang.Object;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class substringOfLength3 {
                 
                 public static void main(String[] args) {
                                  
                                  String s = "exampleeexasaxaxa";


                                  /*  for (int i = 0; i <= s.length() - 3; i++) {
    String substr = s.substring(i, i + 3);
    if (substr.matches("[a-zA-Z]+")) {  
         System.out.println(substr);
    }
}
    
//long x=s.chars().filter(ip)
 int c= s.length()-s.replace("exa", "  ").length();
 
        System.out.println(c);
System.out.println(s.matches("(.*)exa(.*)"));*/
                                  Vector v = new Vector();
                                  
                                  for (int i = 0; i < s.length()-2; i++) {
                                                 //  for (int j = i + 1; j <= s.length(); j++) {
                                                                    String s2 = s.substring(i,i+2);
                                                                    //  System.out.println(s2);
                                                                    v.add(s2);
                                                 //  }

                                                   // String s1=s.substring(i, i+2);
                                                   //  System.out.println();
                                  }
                                  System.out.println(v);
                                  System.out.println(v.size());
                                  int count = 0;
                                  System.out.println( Collections.frequency(v, "xa"));

                                  /*
                                  String a[] = new String[v.size()];
                                  for (int i = 0; i < a.length; i++) {
                                                   a[i] = (String) v.get(i);
                                                   System.out.println(a[i]);
                                  }

                                 
                                  for (int i = 0; i < a.length; i++) {
                                                   if (a[i].equals("xa")) {
                                                                    count++;
                                                   }

                                  }*/
                                  //   System.out.println(count);
                 }
}
