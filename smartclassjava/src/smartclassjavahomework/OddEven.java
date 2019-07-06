package smartclassjavahomework;

import java.util.Scanner;

public class OddEven {
	int number;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		number=scan.nextInt();
	}
	void findOddEven()
	{
		if(number%2==0)
		{
		System.out.println(number + "is Even number");
	
		}
		else
		{
			System.out.println(number + "is Odd Number");
		}
			
	}

}
