package assignment_05;

import java.util.Scanner;

public class Question_08 {
	//1234
	//5678

	//1478
	//3698
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [][] array1 = new int[2][4];
		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				array1[i][j] = input.nextInt();
			}
		}
		int [][] array2 = new int[2][4];
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				array2[i][j] = input.nextInt();
			}
		}
		int [][] array3 = new int[2][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				array3 [i][j] = array1[i][j] * array2[i][j];
				System.out.println(array3[i][j] + "  ");
			}
		}
		System.out.println();
		input.close();
	}
	
}

