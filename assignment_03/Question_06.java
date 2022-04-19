package assignment_03;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {

		int year;

		Scanner input = new Scanner(System.in);
		System.out.print("년도를 입력하시오: ");
		year = input.nextInt();

		if (year % 400 == 0) {
			System.out.println("leap year");
		}
		else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}	
		input.close();	
	}

}
