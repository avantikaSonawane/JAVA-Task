import java.util.*;
public class q3
{
	public static void main(String args[])
	{
		int n, ans=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no. to find factorial : ");
		n = sc.nextInt();
		ans = fact(n);
		System.out.println("Factorial of " + n + " = " + ans);
		
	}
	public static int fact(int x)
	{
		if(x==0)
		{
			return 1;
		}
		else
		{
			return x*fact(x-1);
		}
	}
}