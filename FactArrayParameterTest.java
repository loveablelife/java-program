package com.array.redington;
import java.util.Scanner;
public class FactArrayParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactArrayParameter  fa=new FactArrayParameter();
		int[] elements=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("	FACTORIAL NUMBER USING USER INPUT");
		System.out.println("	+++++++++++++++++++++++++++++++++");
		System.out.println("Enter the n value :");
	int n=scan.nextInt();
	System.out.println("Enter the numbers :");
	for(int i=0;i<n;i++)
	{
				elements[i]=scan.nextInt();
			}
		int[] result=fa.getFactorialNumber(elements);
		System.out.println("\t OUTPUT");
		System.out.println("\t ******");
		for(int i=0;i<n;i++)
		{
			
			System.out.println(elements[i]+ " " +result[i]);
		}
		
	}

}
