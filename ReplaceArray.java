package com.array.redington;
import java.util.Scanner;
public class ReplaceArray {
	int [] number=new int[5];
	int [] replace=new int[5];
	int num,temp;
	Scanner scan=new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter the 5 number :");
		for(int i=0;i<=4;i++)
		{
			number[i]=scan.nextInt();
		}
	}
	void findNumber()
	{
		//int num;
	System.out.println("Enter the Find Number : ");
	num=scan.nextInt();
	int check=0,count=0;
	for(int j=0;j<=4;j++)
	{
		
		if(number[j]==num)
	{
		check=1;
		count=count+1;
		System.out.println(num+" found in the " + j+ " position");
	}
	}
	}
	void replacement()
	{
		temp=num;
		System.out.println("enter the replace number :");
		int rep=scan.nextInt();	
		for(int j=0;j<=4;j++)
		{
			num=rep;
			
		}System.out.println("The number of "+temp+" replace a number "+num);
			}
}
