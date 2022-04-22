package assignment_04_02;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		int n;
		int cnt = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("자연수를 입력하시오: ");
		n = input.nextInt();
		
		for (int i = 1; ;i += 2) {
			if (sum >= n) {
				break;
			}
			sum += i;
			cnt++;
		}
		System.out.print(cnt + " " + sum);
		input.close();
	}

}
