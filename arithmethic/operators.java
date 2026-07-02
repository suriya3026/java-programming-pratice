package arithmethic;
import java.util.Scanner;
class calculation
{
	
	void add(int a,int b)
	{
		
		System.out.println(a+b);
	}
	void subract(int a,int b)
	{
		
		System.out.println(a-b);
	}
	void multiply(int a,int b)
	{
		
		System.out.println(a*b);
	}
	void divison(int a,int b)
	{
		
		System.out.println(a/b);
	}
}

public class operators 
{
	public static void main(String[] args) 
	{
		Scanner ac1=new Scanner(System.in);
		System.out.print("Ente number a :");
		int a=ac1.nextInt();
		System.out.print("Ente number b :");
		int b=ac1.nextInt();
		calculation ac=new calculation();
		ac.add(a,b);
		ac.subract(a,b);
		ac.multiply(a,b);
		ac.divison(a,b);
		
	}
}
