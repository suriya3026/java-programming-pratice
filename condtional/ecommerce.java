package condtional;
import java.util.Scanner;
class shopping
{
	void charge(int amount,String member)
	{
		if ((amount>0)&&(amount<500))
		{
			if(member.equals("yes"))
			{
			System.out.print("Free delivery");
			}
			else 
			{
			int a=amount+50;
			System.out.print(a);
			}
		}
		else if ((amount>=500)&&(amount<=1000))
		{
			if(member.equals("yes"))
			{
				System.out.print("Free delivery");
			}
			else 
			{
			int b=amount+20;
			System.out.print(b);
			}
		}
		else if (amount>1000)
		{
			System.out.print("free delivery");
		}
		else 
		{
			System.out.print("Enter valid amount");
		}
		
	}
	
}
public class ecommerce {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac1=new Scanner(System.in);
		
		System.out.print("Enter yout amount :");
		int amount=ac1.nextInt();
		ac1.nextLine();
		
		System.out.print("Do you have membership ? (yes/no) :");
		String member = ac1.nextLine();
		
		shopping ac=new shopping();
		ac.charge(amount,member);
		

	}

}
