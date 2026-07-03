package condtional;

import java.util.Scanner;
class count
{
	void price( int amount) 
	{
		if ((0<amount)&&(amount<=1000))
		{
			System.out.print("no discount");	
		}
		else if ((amount>=1001)&&(amount<10000))
		{
			int b=amount-((amount*5)/100);
			System.out.print(b);
		}
		else if (amount>=10000)
		{
			int b=amount-((amount*15)/(100));
			System.out.print(b);
		}
		else 
		{
			System.out.print("please enter the valid amount");
		}
	}
	
}

public class discount {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac1=new Scanner(System.in);
		System.out.print("Enter your amount:");
		int amount=ac1.nextInt();
		count ac=new count();
		ac.price(amount);

	}

}
