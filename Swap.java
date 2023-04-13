import java.io.*;
class Swap
{
	public static void main(String args[])
	{
		Console cn=System.console();
		int num1,num2,temp;
		System.out.println("Enter the numbers: ");

		num1=Integer.parseInt(cn.readLine());
		num2=Integer.parseInt(cn.readLine());

		System.out.println("Before swapping: "+num1);
		System.out.println("Before swapping: "+num2);

		temp=num1;
		num1=num2;
		num2=temp;

		System.out.println("After swapping: "+num1);
		System.out.println("After swapping: "+num2);
	}
}
