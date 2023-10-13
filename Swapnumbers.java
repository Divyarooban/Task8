package task8;

import java.util.Scanner;

public class Swapnumbers {
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();		
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping the numbers \na=" +a +"\nb=" +b);
	}	
}
