package smartclassjavahomework;
import java.util.Scanner;

public class BetweenRange {
int a,b,i;
void getInput()
{
	Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
a=scan.nextInt();
System.out.println("enter the number");
b=scan.nextInt();
for(i=a;i<=b;i++)
{
	System.out.println(i);
}

}


}
