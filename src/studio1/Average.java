package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your first integer that you want to be averaged?");
		int n1 = in.nextInt();
		System.out.println("What is your second integer that you want to be averaged?");
		int n2 = in.nextInt();
		
		double average = (n2+n1)/2.0;
		
		System.out.println("The average of " + n1 + " and "+ n2 + " is " +average);
		
		
		
	}

}
