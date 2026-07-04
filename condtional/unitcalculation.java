package condtional;
import java.util.Scanner;

public class unitcalculation {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
	
		System.out.print("Enter your unit :");
		int unit=ac.nextInt();
		
		if ((0<unit)&&(unit<100))
		{
			int b=unit*5;
			System.out.print(b);
		}
		else if((100<=unit)&&(unit<=200))
		{
			int c=(100*5)+((unit-100)*6);
			System.out.print(c);
		}
		else if(200<unit) 
		{
			
			int d=(100*5)+((100)*6)+((unit-200)*8);
			int e=d*10/100;
			System.out.print(e);
		}
		else
		{
			System.out.print("Please enter the unit");
		}

	}

}
