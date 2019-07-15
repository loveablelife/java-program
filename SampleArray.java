package com.array.redington;
import java.util.Scanner;
public class SampleArray {
	int sum=0,average,i,num,count,max,min;
int[] number=new int[5];
Scanner scan=new Scanner(System.in);
void getInput()
{

System.out.println("******************************");
System.out.println("FIND NUMBER AND SUM OF AVERAGE");
System.out.println("******************************");
System.out.println("Enter the Number : ");
for(int i=0;i<=4;i++)
{
	
	number[i]=scan.nextInt();
	
}
for(int j=0;j<=4;j++)
{
	System.out.println(number[j]);
	sum=sum+number[j];
	average=sum/5;

			}
System.out.println("SUM VALUE :"+sum);
System.out.println("AVERAGE VALUE :"+average);
}
void findMethod()
{
	System.out.println("Enter the Find Number : ");
	num=scan.nextInt();
	int check=0;
	for(i=0;i<=4;i++)
	{
		
		if(number[i]==num)
	{
		check=1;
		count=count+1;
		System.out.println(num+" found in the " + i+ "position");
	}
	}
	
	if(check==1)
	{
		System.out.println("Number "+num+ " is found");
		}
	else
	{
		System.out.println("Number "+num+ " is Not found");
	}
	
}
void maxNumber()
{
	int max=number[0];
	for(int i=0;i<=4;i++)
	{
	if(number[i]>max)
	{
		max=number[i];
	}
	}
	System.out.println(max+"is the maximum number");
}
void minNumber()
{
	
	int min=number[0];
	for(int i=1;i<=4;i++)
	{
	if(number[i]<min)
	{
		min=number[i];
		
	}
	
	}
	System.out.println(min+"is the minimum number");
	
}
}
