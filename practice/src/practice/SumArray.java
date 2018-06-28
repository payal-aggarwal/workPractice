package practice;

import java.util.Scanner;

public class SumArray {
	
	static void Array(int n) {
		int arr[]= new int[n];
		int sum=0;
		for (int i=0;i<=n-2;i++) {
			arr[i]=i;
			System.out.println(arr[i]);
			sum = sum + arr[i];
			
		}
		//System.out.println(sum);
	       arr[n-1]=0-sum;
			
	       System.out.println(arr[n-1]);
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		 SumArray.Array(n);
		//System.out.println(output);
		scan.close();
	}

}
