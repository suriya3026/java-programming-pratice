package condtional;
import java.util.Scanner;
class tax
{
	void amount( int income) 
	{
		if ((0<income)&&(income<=250000))
		{
			System.out.print("This amount is no Tax");	
		}
		else if ((income>=250001)&&(income<=500000))
		{
			int a=income*5/100;
			System.out.print(a);
		}
		else if ((income>=500001)&&(income<=100000))
		{
			int b=income*20/100;
			System.out.print(b);
		}
		else if (income>1000000)
		{
			int c=income*30/100;
			System.out.print(c);
		}
		else 
		{
			System.out.print("Enter the correct Income");
		}
		
	}
}

public class taxcalculation 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac1=new Scanner(System.in);
		System.out.print("Enter your amount :");
		int income=ac1.nextInt();
		tax ac=new tax();
		ac.amount(income);
	}

}
