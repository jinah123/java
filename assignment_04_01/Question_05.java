package assignment_04_01;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		int x ;
		int count = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("정수를 입력하시오(0이 입력되면 종료): ");
			x = input.nextInt();

			if (x % 3 != 0 && x % 5 != 0) {
				count += 1;
			}
		}while(x != 0);

		System.out.println(count);
		input.close();

	}
}
