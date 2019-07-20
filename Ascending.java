package com.array.redington;
import java.util.Scanner;
public class Ascending {
int[] number=new int[5];
int[] asc=new int[5];
int[] des=new int[5];
int i;
Scanner scan=new Scanner(System.in);
void getInput()
{
	System.out.println("Enter the Number :");
	for( i=0;i<5;i++)
	{
		number[i]=scan.nextInt();
	}
}
void ascend()
{ 
	for( i=0;i<5;i++)
	{
	asc[i]=number[i];
	des[i]=number[i];
	}
	
	for(int j=0;j<5;j++)
	{
		for(int k=j+1;k<5;k++)
		{
			
		if(asc[j]>asc[k])
		{
			int temp=asc[j];
			asc[j]=asc[k];
			asc[k]=temp;
			//System.out.println(temp);
			
	}
}
}
	System.out.println("\t ASCENDING ORDER");
	System.out.println("\t ~~~~~~~~~~~~~~~");
	for(int i=0;i<5;i++)
	{
		System.out.println(asc[i]);
	}
	
}
void descend()
{ 
	for( i=0;i<5;i++)
	{
	asc[i]=number[i];
	des[i]=number[i];
	}
	
	for(int j=0;j<5;j++)
	{
		for(int k=j+1;k<5;k++)
		{
			
		if(des[j]<des[k])
		{
			int temp=des[j];
			des[j]=des[k];
			des[k]=temp;
			//System.out.println(temp);
			
	}
}
}
	System.out.println("\t DESCENDING ORDER");
	System.out.println("\t ~~~~~~~~~~~~~~~~");
	for(int i=0;i<5;i++)
	{
		System.out.println(des[i]);
	}
	
}
}

