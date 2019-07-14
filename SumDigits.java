package com.Redington.classTest;
import java.util.Scanner;

public class SumDigits {
	
	int a,res,i,j=0,temp;
	public void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value:");
		a=scan.nextInt();
		temp=a;
		while(a>0)
		{
			res=a%10;
			i=i+res;
			a=a/10;
			
		}
			

			if(temp%i==0)
			{
				
				System.out.println("YES");
			}
		
			else
			{
				System.out.println("No");	
			}
		
		}

}

