package com.array.redington;
import java.util.Scanner;
public class FactorialArray {
int[] number=new int[5];
int[] factor=new int[5];
int n,i;
Scanner scan=new Scanner(System.in);

void getInput()
{
	System.out.println("Enter the Number :");
		for(i=0;i<=4;i++)
	{
		number[i]=scan.nextInt();
		
	}
}
void factNumber()
{
	
for(int i=0;i<=4;i++)
{int fact=1;	
	for(int j=1;j<=number[i];j++)
	{
		fact=fact*j;
	}
	factor[i]=fact;
	
	System.out.println("The Factorial Number is "+number[i]  +"	"+ factor[i]);
}
		
}
	
}


