package practice;

import java.util.Scanner;

public class fibonnaci {
	
	static long system(int n) {
		long arr[] = new long [n+1];
		 arr[0]= 0;
		 arr[1]= 1;
	System.out.println(arr[0]+ "\n" + arr[1]);
	
		 for (int i=2;i<=n;i++) {
			 arr[i]= arr[i-1]+arr[i-2];
			 System.out.println(arr[i]);
		 }
		 if (arr[n] > 1000000){
			return  arr[n] % 1000000;
		 }
		 
		return arr[n];
		
	}
/**
 * @param args
 */
public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the integer");
	int n = scan.nextInt();
	long fib = fibonnaci.system(n);
	System.out.println(fib + "is the least 6 decimal value for this series");
	scan.close();
}
}
