package com.array.redington;
import java.util.Scanner;
public class PossitiveNeg {
int[] number= new int[10];

Scanner scan=new Scanner(System.in);
void posNeg()
{
	for(int i=0;i<=9;i++)
	{
		System.out.println("Enter the numbers");
	number[i]=scan.nextInt();
	}
}

	void result()
	{
		
	for( int i=0;i<=9;i++)
	{
	if(number[i]>=0)
	{
		System.out.println(number[i]+"Positive Number");
	}
	else if (number[i]<=0)
	{
		System.out.println(number[i]+"Negative Number");	
	}	
	}
	
	}
}




