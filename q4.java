import java.util.*;
public class q4
{
	public static void main(String args[])
	{
		String arr;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		arr = sc.nextLine();
		String tar="";
		//tar = arr.toCharArray();
		for(i=(arr.length())-1; i>=0; i--)
		{
			tar = tar+arr.charAt(i);
		}
		
		if(arr.equals(tar))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
}