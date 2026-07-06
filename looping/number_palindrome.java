package looping;
import java.util.Scanner;

public class number_palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the digit of number : ");
		int a=ac.nextInt();
		int rev=0;
		int original=a;
		
		while(a>0)
		{
			int temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		
		System.out.println("The reverse number of : " +( rev=rev));
		if (rev==original)
		{
			System.out.print("This is a palindrome");
		}
		else
		{
			System.out.print("This is not palindrome");
		}
		

	}

}
