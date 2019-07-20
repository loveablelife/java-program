package com.array.redington;
import java.util.Scanner;
public class PrimeArray {
int[] primevalue=new int[5];
int s,e,res,i;
int count=0;
Scanner scan=new Scanner(System.in);
void getValue()
{
	System.out.println("Enter the Starting value :");
	s=scan.nextInt();
	System.out.println("Enter the Ending value :");
	e=scan.nextInt();
	for( i=s;i<=e;i++)
	{
		int check=1;
		for (int j=2;j<i;j++)
		{
			if(i%j==0)
			{
		check=0;
		break;
			}
		}
	if(check==1)
	{
		count++;
		primevalue[count]=i;
		System.out.println(primevalue[count]);
	}
	}
}
}

