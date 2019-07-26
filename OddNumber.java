package com.Redington.classTest;
import java.util.Scanner;
public class OddNumber {
	int[] odd=new int[5];
	Scanner sc=new Scanner(System.in);
	public void geInput()
		{
		System.out.println("Enter the Five Numbers :");
		for(int i=0;i<=4;i++)
		{
			odd[i]=sc.nextInt();
			//System.out.println(odd[i]);
		}
			}
	
	public void result()
	{
		System.out.println("ODD NUMBERS");
		for (int i=0;i<=4;i++)
		{
			if(odd[i]%2!=0)
			{
			System.out.println(odd[i]);	
			}
		}
	}
}
