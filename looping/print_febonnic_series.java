package looping;
import java.util.Scanner;

public class print_febonnic_series {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=ac.nextInt();
		
		int a=0;
		int b=1;
		int i;
		for(i=1;i<=n;i++)
		{
			int c=a+b; 
			System.out.print(a+" ");
			a=b;  //1 1 2 3 5
			b=c; // 1 2 3 5 8
		}

	}

}
