package smartclassjavahomework;

import java.util.Scanner;

public class Even {
	int n;
	int i;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		for (int i = 2; i <= n; i++)
		{
			   if (i % 2 == 0)
			   {
				System.out.println("Enter the Even series"+i);
			   }
	}

	}
}
