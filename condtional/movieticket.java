package condtional;
import java.util.Scanner;
class movie
{
	void ticket( int age) 
	{
		if ((0<age)&&(age<12))
		{
			System.out.print("The ticket price is Rs.100");	
		}
		else if ((age>=12)&&(age<60))
		{
			System.out.print("The ticket price is Rs.150");
		}
		else if (age>=60)
		{
			System.out.print("The ticket price is Rs.120");
		}
		else 
		{
			System.out.print("please enter your correct age");
		}
	}
	
}

public class movieticket 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac1=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=ac1.nextInt();
		movie ac=new movie();
		ac.ticket(age);

	}

}
