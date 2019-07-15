package com.array.redington;

import java.util.Scanner;

public class Revers {
int i;
	int[] number=new int[5];
	int[] revers=new int[5];
	Scanner scan=new Scanner(System.in);

	void getInput()
	{
		System.out.println("Enter the Number :");
		for(int i=0;i<=4;i++)
		{
			number[i]=scan.nextInt();
			
		}
		
	}
	void revInput()
	{
		for(int j=4;j>=0;j--)
		{
			revers[j]=number[j];
			System.out.println("Reverse Number is :"+revers[j]);
		}
		
		}
}
