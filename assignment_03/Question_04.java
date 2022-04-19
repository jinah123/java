package assignment_03;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {

		int x;

		Scanner input = new Scanner(System.in);
		System.out.print("1-12사이의 정수를 입력하시오: ");

		x = input.nextInt();

		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			System.out.println("31");
		}
		else if (x == 4 || x == 6 || x == 9 || x == 11) {
			System.out.println("30") ;
		}
		else if (x == 2) {
			System.out.println("28");
		}
		else {
			System.out.println("error");
		}

		input.close();
	}

}
