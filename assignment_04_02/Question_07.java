package assignment_04_02;

import java.util.Scanner;

public class Question_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : ");
		int n = input.nextInt();

		for ( int i = 1; i <= n ; i++) {
			for ( int j = 1; j <= n-i; j++ ) {
				System.out.print("  ");
			}
			for (int k = 1 ; k <= i ; k++) {
			System.out.print(k + " ");
			} System.out.println();
		}
		input.close();
	
	}
}
