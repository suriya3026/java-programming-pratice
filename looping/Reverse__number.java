package looping;
import java.util.Scanner;


public class Reverse__number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the digit of number :");
		int a=ac.nextInt();
		System.out.print("the reverse numbers : ");
		int rev=0;
		
		while (a>0)
		{
			 int temp=a%10;
			 rev=rev*10+temp;
			 a=a/10;
		}
		System.out.print(rev);
		ac.close();

	}

}
