package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array length");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int Arr[] = new int[n];
				
		for(int i = 0; i < Arr.length; i++) {
		      Arr[i] = (int) scan.nextInt();
		    		  //(Math.random()*20 + 1);
		    }
		
		
		System.out.println(Arrays.toString(Arr));
		
		System.out.println("Enter the number to search");
		int num = scan.nextInt();
		scan.close();
		
		boolean isPresent = false;
		int i=0;
		 for ( i =0;i<Arr.length;i++) {
			if (Arr[i]==num) {
				isPresent = true;
				break;
			}
		}
		 
		 if (isPresent)
		 {
			 System.out.println(i);
		 }
		 else	
					System.out.println("number not in array");
				
			
		
			
		}
	

}
