package com.Redington.classTest;
import java.util.Scanner;
public class FindString {
String[] name=new String[5];
String[] newName=new String[5];
String[] uppname=new String[5];
Scanner scan=new Scanner(System.in);
public void getInput()
{System.out.println("Enter the Five Strings :");
	for(int i=0;i<=4;i++)
	{
		name[i]=scan.nextLine();
		newName[i]=name[i].toLowerCase();
		//uppname[i]=name[i].toUpperCase();
		//System.out.println(name[i]);
			}
	
}
public void mainFun()
{
	int n;
	//String letter;
	System.out.println("starting String Letter is u");
	System.out.println("***************************");
	for(int i=0;i<=4;i++)
	{
		n=name[i].length();
		
		if(name[i].charAt(0)=='u')
		{
			System.out.println(name[i].toUpperCase());
			System.out.println("Words length :"+n);
		
		}
	}
}
public void lower()
{
	int n;
System.out.println("Ending String Letter is l");
System.out.println("***************************");

	for(int i=0;i<=4;i++)
	{
		n=name[i].length();
		
		
		if(name[i].charAt(n-1)=='l')
		{
			System.out.println(newName[i].toLowerCase());
			System.out.println("Words length :"+n);
		}
	}
}
}



