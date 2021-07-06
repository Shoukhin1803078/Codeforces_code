package codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class codeforces1355B {
    public static void main(String[] args) {
        int T;
        Scanner ob=new Scanner(System.in);
        T=ob.nextInt();
        for(int t=1;t<=T;t++)
        {
        int n;
        n=ob.nextInt();
        Integer a[]=new Integer [n];
        for(int i=0;i<a.length;i++)
        {
        a[i]=ob.nextInt();
        }
        Arrays.sort(a);
        int c=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            int x=a[i];
            for(int j=i+1;j<a.length;j++)
            {
            if(x==a[j])
            {
             
            break;
            }
            }
            
           
        }
           
        
        
        
        
        
        
        
        } 
    }
}