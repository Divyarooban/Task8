package task8;

import java.util.Scanner;

public class Count_Digits_integer {
	
	public static void main(String[] args) {
		
		System.out.println("Enter an integer:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		
		while(n>0) {
			n=n/10; //            
			c++;                
		}
		System.out.println(c);

	}
}
