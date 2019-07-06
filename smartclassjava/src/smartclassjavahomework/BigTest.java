package smartclassjavahomework;
import java.util.Scanner;

public class BigTest {

	public static void main(String[] args) {
		
		 Biggest3 bb=new  Biggest3();
		 Scanner scan=new Scanner(System.in);
		 System.out.println("     BIGGEST OF THREE NUMBERS     ");
		 System.out.println("     @@@@@@@@@@@@@@@@@@@@@@@@     ");
		 System.out.println("Enter the number:");
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 int c=scan.nextInt();
		int d= bb.bigNumber(a,b,c);
		 System.out.println("The Biggest Number is "+d);


	}

}
