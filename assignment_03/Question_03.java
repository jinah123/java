package assignment_03;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {

		int number;

		Scanner input = new Scanner(System.in);

		System.out.print("Number? ");
		number = input.nextInt();

		switch (number) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know");
			break;
		}

		input.close();
	}

}
