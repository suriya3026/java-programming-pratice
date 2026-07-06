package looping;
import java.util.Scanner;

public class count_number {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter your number of Digit : ");
		int a=ac.nextInt();
		
		int count=0;
		while (a>0)
		{
			a=a/10;
			count++;
		}
		System.out.print("Total of number digit :"+count);

	}

}
