package task8;

import java.util.Scanner;

public class seniorcitizen {

	public static void main(String[] args) {
		System.out.println("Enter the age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("The person is senior citizen");
		}
		else
			System.out.println("The person is not a senior citizen");

	}

}
