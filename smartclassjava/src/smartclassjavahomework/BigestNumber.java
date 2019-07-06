package smartclassjavahomework;
import java.util.Scanner;
public class BigestNumber {
	int number1,number2;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		number1=scan.nextInt();
		System.out.println("Enter the number:");
		number2=scan.nextInt();
		
	}
	void findBigNumber()
	{
		if(number1>number2)
		{
		System.out.println(number1+"is big");	
		}
		else
		{
			System.out.println(number2+"is big");
		}
	}

}
