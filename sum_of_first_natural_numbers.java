package looping;
import java.util.Scanner;

public class sum_of_first_natural_numbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a=ac.nextInt(); //1234
		
		int i=0;
		int sum=0;
		for(i=0;i<=a;i++) 
		{
			sum=sum+i;
		}
		System.out.print("the sum of natural number is :"+sum);
		ac.close();
		

	}

}
