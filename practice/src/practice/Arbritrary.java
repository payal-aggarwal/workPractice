/*
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Payal
 *Program to generate an integer greater than the number and ends with 0 , not greater than 10
 */
public class Arbritrary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter the number");
		
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
scan.close();
		
if (num <1000000000) {
	 int x;
	 x= num-(num%10)+10;
	 System.out.println("The number is"+ " " +x);
} 

	}
catch(Exception e)
{
	System.out.println("Enter a number less than 1000000000");
}
	}
}