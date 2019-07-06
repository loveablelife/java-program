package smartclassjavahomework;
import java.util.Scanner;

public class Line {
	int x1,x2;
	int y1,y2;
	float m;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the x1 value:");
		x1=scan.nextInt();
		System.out.println("enter the x2 value:");
		x2=scan.nextInt();
		System.out.println("enter the y1 value:");
		y1=scan.nextInt();
		System.out.println("enter the y2 value:");
		y2=scan.nextInt();
		
	}
	void result()
	{
	m=(y2-y1)/(x2-x1);
	System.out.println("line value is:"+m);
	}

}
