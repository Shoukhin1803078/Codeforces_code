package codeforces;

import java.util.*;

public class cf_1676_D{

	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		out:
		for(int tt=0;tt<t;tt++){
			HashMap<Integer,Integer> hs=new HashMap();

			int n=ob.nextInt();
			int a[]=new int[n+1];
			for(int i=1;i<n+1;i++){
				int x=ob.nextInt();
				a[i]=x;
				hs.put(a[i],hs.getOrDefault(a[i],0)+1);
			}

			for(int i:hs.values()){
				if(i==1){
					System.out.println("-1");
					continue out;
				}
			}
			if(n%2==0){
				for(int i=n;i>=1;i--){

					System.out.print((i)+" ");
				}
				System.out.println();
			}else{
				int p[]=new int[n+1];
				int k=n;
				for(int i=1;i<=n;i++){
					p[i]=k;
					k--;
				}
				int temp=p[(n/2)+1];
				p[(n/2)+1]=p[n/2];
				p[(n/2)]=temp;
				for(int i=1;i<=n;i++){
					System.out.print(p[i]+" ");
				}
				System.out.println();

			}
		}
	}
}
