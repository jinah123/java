package assignment_04_02;

import java.util.Scanner;

public class Question_08 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : ");
		int n = input.nextInt();
		
		int x = 1;
		
		for ( int i = 0; i < n; i++ ) 
		{
			for ( int j = 1; j <= i; j++ ) 
			{
				System.out.print("  ");
			}
			for ( int j = 1; j <= n-i ; j++ ) 
			{
				System.out.print(x++ + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
