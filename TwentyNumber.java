package com.array.redington;
import java.util.Scanner;
public class TwentyNumber {
	int[] numbers=new int[10];
	int start,end;
	Scanner scan=new Scanner(System.in);
	void getInput()
	{
		System.out.println("  +++++++++");
		System.out.println("  SUB ARRAY");
		System.out.println("  +++++++++");
		System.out.println("Enter the 10 Numbers :");
		for(int i=0;i<=9;i++)
		{
			numbers[i]=scan.nextInt();
		}
	}
	void start()
	{
		System.out.println("Numbers lies between the indexes of 3 to 8");
		for(int i=3;i<=8;i++)
		{
			System.out.println(numbers[i]);
			
		}
	}
}
