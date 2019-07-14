package com.Redington.classTest;
import java.util.Scanner;
public class Factors {
private int n;
public void getInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=scan.nextInt();
}
public void factOf()
{
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
		}
	}
}
}
