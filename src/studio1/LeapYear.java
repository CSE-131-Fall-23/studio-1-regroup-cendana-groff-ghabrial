package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What year do you want to check is a leap year?");
		int year = in.nextInt();
		
		boolean div4 = year%4 == 0;
		boolean div400 = year%400 == 0;
		boolean div100 = year%100 != 0;
				
		
		boolean leapyear = (div4 && div100) || div400;
		
		System.out.println(leapyear);
		

	}

}
