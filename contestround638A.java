
package codeforces;

import java.util.Scanner;

public class contestround638A {
        public static void main(String[] args) {
        int t;
        Scanner ob=new Scanner(System.in);
        t=ob.nextInt();
        int arr[]=new int [100];
        int sum=0,gum1=0;
        int a=2,r=2;
        int pod=0,lastpod=0,sum1=0;
        
        for(int k=0;k<t;k++)
        {
            arr[k]=ob.nextInt();
            int x=arr[k];
            lastpod=a*((int)Math.pow(r,(x-1)));
            for(int i=1;i<=((x/2)-1);i++)
            {
            pod=a*((int)Math.pow(r,(i-1)));
            sum=sum+pod;
            }
             sum1=sum+lastpod;
            for(int i=(x/2);i<=x-1;i++)
            {
                pod=(a*((int)Math.pow(r,(i-1))));
                gum1=gum1+pod;
            }
       
            System.out.println(sum1-gum1);
            pod=0;
            lastpod=0;
            sum=0;
            gum1=0;
            sum1=0;
            
        }
 
    }
}
