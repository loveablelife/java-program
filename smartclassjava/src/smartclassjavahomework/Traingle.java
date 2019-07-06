package smartclassjavahomework;
import java.util.Scanner;

public class Traingle {
	int berath;
	int height;
	float result;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Berath:");
		berath=scan.nextInt();
		System.out.println("enter the Height:");
		height=scan.nextInt();
		
	}
void result()
{
	result=berath*height/2;
	System.out.println(result + "is Traingal");
}
}
