package assignment_04_01;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("자연수를 입력하시오.: ");
		int x;
		x = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(x*i + " "); 
		}
		input.close();
	}
}
