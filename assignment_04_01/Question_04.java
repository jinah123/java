package assignment_04_01;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("100이하의 양의 정수를 입력하시오.: ");
		int x = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		input.close();
	}

}
