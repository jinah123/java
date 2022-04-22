package assignment_05;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("10개의 문자를 입력해 주세요 : "); 
		char[] number = new char[10]; 
		
		for (int i = 0; i < 10; i++) 
		{
			number[i] = input.next().charAt(0);
		}
		System.out.print( number[0]+ " " + number[3] + " " + number[6] ); 
		input.close();
	}

}
