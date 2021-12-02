import java.util.*;
public class q2
{
	public static void main(String args[])
	{
		int n, t1=0, t2=1, t3;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want in fibonacci series ? : ");
		n = sc.nextInt();
		if(n==0)
		{
			System.out.println("Enter valid Number");
		}
		if(n==1)
		{
			System.out.print("First no. = " + t1);
		}
		if(n==2)
		{
			System.out.print("First no. = " + t1 + "\nSecond no. = " + t2);
		}
		else
		{
			System.out.print(t1 + " " + t2 + " ");
			while(n>2)
			{
				t3 = t1+t2;
				System.out.print(t3 + " ");
				t1 = t2;
				t2 = t3;
				n--;
			}
		}
		
	}
}