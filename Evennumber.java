package task8;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println("It is an even number");
		}
		else
			System.out.println("It is an Odd number");
		
	}

}
