package looping;
import java.util.Scanner;

public class sum_of_digit{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter your number of Digit : ");
		int a=ac.nextInt();
		
		int temp=0;
		while (a>0)
		{
			int rem=a%10;
			temp=temp+rem;
			a=a/10;
		}
		System.out.print("Total of number digit : "+temp);

	}

}
