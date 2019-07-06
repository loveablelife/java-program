package smartclassjavahomework;

import java.util.Scanner;

public class Distance {
	int x1,x2,y1,y2;
	double d;
	int first,secont;
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
	void twoPoint()
	{
	first=(x2-x1)*(x2-x1);
	secont=(y2-y1)*(y2-y1);
	d=Math.sqrt(first+secont);
	System.out.println("Distance between two points:"+d);
	}

}
