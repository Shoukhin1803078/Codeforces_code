package codeforces;

import java.util.Scanner;

public class NewClass4 {

	public static void main(String[] args) {
		int n;
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		int run=0;
		int wicket=0;
		double over=0;
		for (int i=0; i<n; i++) {
			int x=ob.nextInt();
			String c=ob.next();
			if (c.equals("WD")) {
				run++;
			}
			else if (c.equals("N")) {
				run++;
			}
			else if (c.equals("W")) {
				over ++;
				wicket++;
			}
			else if (c.equals("L")) {
			over++;
			run=run+x;
			}
			System.out.printf("%d|",run);
			System.out.printf("%d|",wicket);
			if(over<=6)
			{
		                      if(over==1){System.out.println(0.1);}
			else if(over==2){System.out.println(0.2);}
			else if(over==3){System.out.println(0.3);}
			else if(over==4){System.out.println(0.4);}
			else  if(over==5){System.out.println(0.5);}
			else  if(over==6){System.out.println(1.0);}
			}
			else if((over >6)&&(over %6==0))
			{
				System.out.printf("%.1f",over/6);
				System.out.println();
			}
			else if((over>6) &&(over%6!=0) )
			{
				//System.out.printf("%.1f",(over/6));
				//System.out.printf("%.1f",over%6);
				System.out.print((int )(over/6));
				System.out.print(".");
				System.out.print((int )(over%6));
				System.out.println();
			}
		}
	}
}
/*
16
1 L
2 L
0 W
0 W
6 L
2 L
2 L
2 W
3 WD
4 L
5 L
6 L
2 W 
2 WD
4 W
0 N
*/