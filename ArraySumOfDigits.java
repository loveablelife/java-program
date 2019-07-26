package com.Redington.classTest;
import java.util.Scanner;
public class ArraySumOfDigits {

	int[] sumOfDigit=new int[5];
	int[] digits=new int[5];
	int[] number=new int[5];
	int rem,sum,division;
	Scanner scan=new Scanner(System.in);
	public void getInput()
	{
		System.out.println("Enter the three digits numbers :");
		for(int i=0;i<5;i++)
		{
			number[i]=scan.nextInt();
			digits[i]=number[i];
		}
	}
	public void sumOfResult()
	{
		for(int j=0;j<=4;j++)
		{
			sum=0;
			while(number[j]>0)
			{
				rem=number[j]%10;
			    sum=sum+rem;
				number[j]=number[j]/10;
			}
			sumOfDigit[j]=sum;
			if(sumOfDigit[j]>9)
			{
				sum=0;
				while(sumOfDigit[j]>0)
				{
				rem=sumOfDigit[j]%10;
				sum=sum+rem;
				sumOfDigit[j]=sumOfDigit[j]/10;	
				}
				sumOfDigit[j]=sum;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Sum of digit  "+digits[i]+ " is "+sumOfDigit[i]);
			
		}

		
	}
	public void revers()
	{
		int rev;
		System.out.println("Revers");
		for(int j=0;j<=4;j++)
		{
			System.out.println();
		while(digits[j]>0)
		{
		rev=digits[j]%10;
		System.out.print(""+rev);
		digits[j]=digits[j]/10;
		}
}System.out.println();
}
	}
