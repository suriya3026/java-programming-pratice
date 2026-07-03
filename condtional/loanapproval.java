package condtional;

import java.util.Scanner;
class loan
{
	void approval( int salary,int score) 
	{
		if ((0<salary)&&(salary<50000)&&(score>=750))
		{
			System.out.print("The loan is approved");	
		}
		else if ((salary>=30000)&&(score>=650))
		{
			System.out.print("The loan is partial approval");
		}
		else 
		{
			System.out.print("Rejected");
		}
	}
}

public class loanapproval {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac1=new Scanner(System.in);
		System.out.print("Enter your salary :");
		int salary=ac1.nextInt();
		System.out.print("Enter your credit score :");
		int score=ac1.nextInt();
		loan ac=new loan();
		ac.approval(salary,score);

	}

}
