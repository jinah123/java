package assignment_04_02;

import java.util.Scanner;

public class Question_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : ");
		int n = input.nextInt();
		
		int x = 1; 
		
		for ( int i = 0; i < n; i++ )  
		{
			for ( int j = 0; j < n; j++ )  
			{
				System.out.print(x + " ");
				x = (x+2)%10; 
			}
			System.out.println();
		}
		input.close();
	}

}
