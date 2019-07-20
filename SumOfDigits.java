package com.array.redington;
import java.util.Scanner;
public class SumOfDigits {
	int[] num=new int[5];
	int[] sum=new int[5];
	int[] sub=new int[5];
	Scanner sc=new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter the Number :");
		for( int i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
			sub[i]=num[i];
		}
	}
	void sumOfResult()
	{
			
	for(int i=0;i<5;i++)
	{	
		while(num[i]>0 || sum[i]>9)
		{
			if(num[i]==0)
			{
				num[i]=sum[i];
				sum[i]=0;
			}
		
			int res=num[i]%10;
			sum[i]=sum[i]+res;
			num[i]=num[i]/10;
			
				}
	}
		
	}
	public void print()
	{
		System.out.println("SUM OF DIGITS OF ARRAY");
		for(int i=0;i<5;i++)
		{
			System.out.println(sum[i]);
		}
	}
	public void display()
	{
	for(int i=0;i<5;i++)
	{
		if(sub[i]%sum[i]==0)
		{
			System.out.println(sub[i]);
		}
			
	}
	}
	}
	
	
