package assignment_02;

import java.util.Scanner;

public class Question_03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하시오:");
		int x = input.nextInt();
		System.out.print("두번째 정수를 입력하시오:");
		int y = input.nextInt();
		
		int nextx =  x++;
		int nexty = --y;
		
		System.out.print(nextx + " ");
		System.out.print(nexty + " ");
		System.out.println(nextx * nexty + " ");
		
		input.close();
	}

}
