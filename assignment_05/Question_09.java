package assignment_05;

import java.util.Scanner;

public class Question_09 {
	
	public static void main(String[] args) 
	{
	int[][] student = new int[4][3]; 
		
		Scanner input = new Scanner (System.in);

		for (int i = 1; i < 5; i++) //4행
		{
			System.out.print((i) + "class? ");
			for (int j = 0; j < 3; j++) //3열
			{
				student[i][j] = input.nextInt();
			}
		}

		for (int i = 1; i < 5; i++) //4행
		{
			int sum = 0; //합계를 구해줘야 하므로

			System.out.print((i) + "class : ");
			for (int j = 0; j < 3; j++) 
			{
				sum += student[i][j];
			}
			System.out.println(sum);
		}
//		int[][] student = new int[4][3]; 
//		
//		Scanner input = new Scanner (System.in);
//
//		for (int i = 0; i < 4; i++) //4행
//		{
//			System.out.print((i + 1) + "class? ");
//			for (int j = 0; j < 3; j++) //3열
//			{
//				student[i][j] = input.nextInt();
//			}
//		}
//
//		for (int i = 0; i < 4; i++) //4행
//		{
//			int sum = 0; //합계를 구해줘야 하므로
//
//			System.out.print((i + 1) + "class : ");
//			for (int j = 0; j < 3; j++) 
//			{
//				sum += student[i][j];
//			}
//			System.out.println(sum);
//		}
		input.close();
	}

}
