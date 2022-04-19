package assignment_03;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		int num = input.nextInt();

		if (num>0) {
			System.out.println("plus");
		}
		else if(num<0) {
			System.out.println("minus");
		}
		else {
			System.out.println("zero");
		}

		input.close();
	}

}
