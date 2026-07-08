package patten;

import java.util.Scanner;

public class patten_9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int line=ac.nextInt();
		int count=0;
		
		
		int space=line-1;
		int star=line-space;
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=star;j++)
			{
				count++;
				System.out.print(count);
			}
		System.out.println();
		star+=2;
		space--;
		ac.close();
			
		}
		
		
		
	}

}
