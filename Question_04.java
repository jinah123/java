package assignment_02;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("민수의 키를 입력하시오: ");
		int h1 = input.nextInt();
		System.out.print("민수의 몸무게를 입력하시오: ");
		int w1 = input.nextInt();
		System.out.print("가영이의 키를 입력하시오: ");
		int h2 = input.nextInt();
		System.out.print("가영이의 몸무게를 입력하시오: ");
		int w2 = input.nextInt();
		
		boolean a = (h1>h2) && (w1>w2);
		System.out.println(a);
		
		input.close();
	}

}
