import java.util.*;
public class q1
{
	public static void main(String args[])
	{
		int x,y,n;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\nEnter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter 5 to quit");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("\nEnter 2 numbers");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Addition = " + (x+y));
					break;
				case 2:
					System.out.println("\nEnter 2 numbers");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Subtraction = " + (x-y));
					break;
				case 3:
					System.out.println("\nEnter 2 numbers");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Multiplication = " + (x*y));
					break;
				case 4:
					System.out.println("\nEnter 2 numbers");
					x = sc.nextInt();
					y = sc.nextInt();
					System.out.println("Division = " + (x/y));
					break;
				case 5:
					System.exit(0);
					
			}
			
			
		}
	}
}