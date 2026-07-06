package looping;
import java.util.Scanner;

public class print_add_number {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the last number : ");
		int a=ac.nextInt();
		System.out.println("The odd number");
		
		int i=1;
		for(i=1;i<=a;i++)
		{
			System.out.println(i);
			i=i+1;
			ac.close();
		}
		
			

	}

}
