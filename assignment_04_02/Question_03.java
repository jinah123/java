package assignment_04_02;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		int row ;
		int column;
		Scanner input = new Scanner(System.in);
		System.out.print("행과 열의 수를 입력하시오: ");
		row = input.nextInt(); column= input.nextInt();
		for (int i = 1; i <= row; i++ )  
		{ 
			for (int j = 1; j <= column; j++ ) 
			{
				System.out.print(i * j + " " );  
			}
			System.out.println(); 
		}
		input.close();

	}
}
