package looping;
import java.util.Scanner;

public class print_to_number_1_to_100 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter your last digit : ");
		int a=ac.nextInt();
		
		int i=0;
		for (i=0;i<=a;i++)
		{
			System.out.println(i);
			ac.close();
		}

	}

}
