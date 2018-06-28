package practice;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		System.out.println("enter x");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println("enter y");
		Scanner scan1 = new Scanner(System.in);
		
		int y = scan1.nextInt();
		
	
		scan.close();
		scan1.close();
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("x is"+ "" +x);
		System.out.println(y);
		
		
		

	}

}
