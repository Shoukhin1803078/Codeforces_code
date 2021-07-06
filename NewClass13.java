package codeforces;

import java.util.Scanner;
import java.util.Vector;

public class NewClass13 {

                 public static void main(String[] args) {
                                  Scanner ob = new Scanner(System.in);
                                  int n = ob.nextInt();
                                  String s = ob.next().toLowerCase();
                                  int k = 0;
                                  int ans = 0;
                                  Vector v=new Vector();
                                  
                                  for (char c = 'a'; c <= 'z'; c++) {
                                                   for (int i = 0; i < s.length(); i++) {
                                                                    if (c == s.charAt(i)) {
                                                                                    k++;
                                                                                    
                                                                    }
                                                   }
  
                                                  v.add(k);
                                                   k=0;  
                                  }
                                  for(int i=0;i<26;i++)
                                  {
                                  if((int )v.get(i)==0)
                                  {ans=1;break;}
                                  }
                                  if(ans==1){System.out.println("NO");}
                                  else System.out.println("YES");
                                 // System.out.println(v);   
                 }
}
