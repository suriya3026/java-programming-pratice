package looping;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Ener the factorial number is : ");
		int a=ac.nextInt();
		
		int i=0;
		int fact=1;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.print("The factorial number is : "+fact);
		ac.close();
		
		

	}

}
