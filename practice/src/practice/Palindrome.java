/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Payal
 *Identify whether number is Palindrome or not or reverse a number
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("Enter a number to get reverse");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int x=num;
	scan.close();
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;		
	}
	System.out.println(rev);
	if (x==rev)
	{
		System.out.println("The number is palindrome");
		
	}
	else
		System.out.println("The number is not palindrome");
}
	catch(Exception e)
	{
	
		System.out.println("The number entered is wrong");
	
	}
	}
	}


