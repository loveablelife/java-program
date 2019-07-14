package smartclassjavahomework;

import java.util.Scanner;

public class Voteing {
String name;
String vote_Id_Number;
int dateOfBirth;
int age;
String gender;
int c;

void voteInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("************************");
	System.out.println("* VOTING ENTER PROCESS *");
	System.out.println("************************");
	System.out.print("Enter your Name:");
	name=scan.next();
	System.out.println("male");
	System.out.println("Female");
	System.out.print("Enter your Gender:");
	gender=scan.next();
	/*if(gender.equals("male"))
	{
		System.out.println("Male");
	}
	else{
		System.out.println("Female");
	}*/
	System.out.print("Enter your Vote_Id_Number:");
	vote_Id_Number=scan.next();
			System.out.print("Enter your Date_Of_Birth:");
	dateOfBirth=scan.nextInt();
	c= (2019-dateOfBirth);
	System.out.println("Age is  " +c);
	if (c>=18)
	{
		System.out.println("   Eligible    ");
	}
	else if(c<=17)
	{
		System.out.println("    Not Eligible");
	}
	//boolean choice=scan.next();
	//Voteing sc=new Voteing();
	//choice.getInput();
	//if(choice==1)
	//{
	//	sc.
	//}
	//{
	/*if(age>=18 && age<=100)
	{
		System.out.println("Eligible");
	}else
	{
		System.out.println("Not Eligible");
	}*/
		
	}

}
