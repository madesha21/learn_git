import java.io.*;
class Even_odd
{
	public static void main(String args[])
	{
		Console cn=System.console();

		int num;

		System.out.println("Enter the number: ");
		num=Integer.parseInt(cn.readLine());

		if(num %2 == 0)
		{
			System.out.println("Even number :"+num);
		}
		else
		{
			System.out.println("Odd number :"+num);
		}
	}
}
		
