package codeforces;
import java.util.ArrayList;
import java.util.Scanner;
public class codeforces1335C {
    public static void main(String [] shoukhin)
    {
    int T;
    Scanner ob=new Scanner (System.in); 
    T=ob.nextInt();
    for(int t=1;t<=T;t++)
    {
        int n;
        n=ob.nextInt();
    int a[]=new int [n];
    int b[]=new int [n];
    int c[]=new int [n];
    
   ArrayList a1=new ArrayList();
   ArrayList a2=new ArrayList();
    
    for(int i=0;i<a.length;i++)
    {
    a[i]=ob.nextInt();
    }   
    for(int i=0;i<a.length;i++)
    {
    for(int j=i+1;j<a.length;j++)
    {
    if(a[i]!=a[j])
    {
    b[i]=a[i];
    }
    else
    {
    c[i]=a[i];
    }
    }
    }
    for(int i=0;i<c.length;i++)
    {
        System.out.println(c[i]);
    }
    
   
    }
    }
}