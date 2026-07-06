package looping;
import java.util.Scanner;

public class print_multiplication_table {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the table number : ");
		int a=ac.nextInt();
		System.out.println("The multiplication "+ a +"th table");
		
		int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println(i + "x" + a + "=" +a*i );
			ac.close();
		}

	}

}
