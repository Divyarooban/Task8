package task8;

import java.util.Scanner;

public class greaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter c:");
		int c = sc.nextInt();
		System.out.println("Enter d:");
		int d = sc.nextInt();
		
		int x=a+b;
		int y=c+d;
		
		if(x>y){
			System.out.println("Sum of x is greater");
			
		}
		else
			System.out.println("Y is greater");
	}

}
