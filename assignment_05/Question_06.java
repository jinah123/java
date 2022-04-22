package assignment_05;

import java.util.Scanner;

public class Question_06 {
	//5 10 8 55 6 31 12 24 61 2

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("정수를 10개 입력해 주세요 : ");
		
		int[] numArray = new int[10];
		int min = 1000; 
		
		for (int i = 0; i<10; i++) 
		{
			numArray[i] = input.nextInt();
			min = Math.min(numArray[i],1000);
		}
		
		System.out.println( min );
		input.close();

	}

}
