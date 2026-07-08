package patten;
import java.util.Scanner;

public class patten_3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int line=ac.nextInt();  //3 
		
		int star=2*line-1; // 5 line+2 
		int space=0; 
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");	
			}
			for(int j=0;j<star;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		star-=2;
		space++;
		ac.close();
			
		}	
	}

}
