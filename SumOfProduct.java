package com.Redington.classTest;
import java.util.Scanner;
public class SumOfProduct {
	 int number,x=0,i=0,result;
			 double average;
	 boolean b=true;
	 char c;
	 	public void getInput()
	{
		while(b)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=scan.nextInt();
		x=x+number;
		i++;
		System.out.println("Do you want continue: y/q");
		c=scan.next().charAt(0);		
			if(c=='q')
		{
			
			b=false;;
				}
		
		}
	}
		public void methodSum()
		{
			result=x;
			System.out.println("RESULT: "+result);
			average=x/i;
			System.out.println("AVERAGE: "+average);
		}
		
		
	

}
