package assignment_04_01;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {


		int sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("100 이하의 정수를 입력하시오.: ");

		int x;
		x = input.nextInt();

		for (int i = x; i<=100; i++) {
			sum += i; 
		}
		System.out.println(sum);
		input.close();
	}

}
