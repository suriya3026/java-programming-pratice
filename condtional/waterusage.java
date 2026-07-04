package condtional;

import java.util.Scanner;
class water
{
	void usage( int liter) 
	{
		if ((0<liter)&&(liter>=1000))
		{
			int a=liter*2/100;
			System.out.print(a);	
		}
		else if ((liter>=1001)&&(liter>=5000))
		{
			int b=((liter*5)/(100));
			System.out.print(b);
		}
		else 
		{
			int c=liter+(liter*15/100);
			
			System.out.print(c);
		}
	}
}

public class waterusage {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac1=new Scanner(System.in);
		System.out.print("Enter your liter:");
		int liter=ac1.nextInt();
		water ac=new water();
		ac.usage(liter);

	}

}
