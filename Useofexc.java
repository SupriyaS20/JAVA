package exceptionHandling;

import java.util.Scanner;

public class Useofexc {

	public static void main(String[] args) 
	{
		
		Useofexc obj=new Useofexc();
		try 
		{
			obj.demo();
		} 
		catch (Supriyaexc e) 
		{
			System.out.println("MSG="+e.getMessage());
		}

	}
	
	public void demo() throws Supriyaexc
	{
		int num1;
		try(Scanner sc=new Scanner(System.in)){
		System.out.print("Enter a Numbers : ");
		num1=sc.nextInt();
		}
		if(num1>0)
		{
			throw new Supriyaexc("It is an Positive Number");
		}
		else
		{
			throw new Supriyaexc("It is an Negative Number");
		}
	}

}