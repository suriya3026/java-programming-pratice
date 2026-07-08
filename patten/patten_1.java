package patten;
import java.util.Scanner;

public class patten_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int line=ac.nextInt();
		
		int star=0;
		
		
		for(int i=0;i<line;i++)
		{
			
			for(int j=0;j<=star;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		star++;
		
		ac.close();
			
		}
		
		
		
	}

}
