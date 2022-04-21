package assignment_04_01;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("100이하의 정수를 입력하시오: ");
		int number;
		number = input.nextInt();
		while (i <= number) {
			sum += i;	
			i ++;			
		}
		System.out.println(sum);
		input.close();
	}
}
