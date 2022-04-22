package assignment_05;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		
	double [] average = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 }; 
		
		Scanner input = new Scanner (System.in);
		System.out.print("두 반의 번호를 입력해 주세요 : ");
		int class1 = input.nextInt(), class2 = input.nextInt();
		
		double sum = average[class1-1] + average[class2-1]; 
		
		System.out.printf( "%.1f",sum ); 
		
		input.close();
	}
}
