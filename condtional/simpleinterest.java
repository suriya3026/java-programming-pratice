package condtional;

import java.util.Scanner;
class interest
{
	void si( int income) 
	{
		if ((0<income)&&(income<=5000))
		{
			int a=income*5/100;
			System.out.print("The Amount is :"+a);	
		}
		else if ((income>=5000)&&(income<=20000))
		{
			int b=income*7/100;
			System.out.print("The Amount is :"+b);
		}
		else 
		{
			int c=income*10/100;
			System.out.print("The Amount is :"+c);
		}
		
	}
}

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac1=new Scanner(System.in);
		System.out.print("Enter your amount:");
		int income=ac1.nextInt();
		interest ac=new interest();
		ac.si(income);

	}

}
