package assignment_04_02;

import java.util.Scanner;

public class Question_02 {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner input = new Scanner ( System.in );
		System.out.print("2부터 9까지의 수 중 두 개를 입력하시오 : ");
		num1 = input.nextInt(); num2 = input.nextInt(); 
		
		while ((2 <= num1 && num2 <= 9) && (2 <= num2 && num2 <= 9)) 
		{
			if ( num1 < num2 ) 
			{
				for ( int row = 1; row <= 9; row++ ) //행
				{	
					for ( int column = num1; column <= num2; column++ ) //
					{
						int multi = column * row;
					    System.out.print(column + " * " + row + " = " + multi + "   ");
					}  
					System.out.println();
				}
			}
			else if ( num1 > num2) 
			{
				for ( int row = 1; row <= 9; row++ ) 
				{	
					for ( int column = num1; column >= num2; column-- ) 
					{
						int multi = column * row;
					    System.out.print(column + " * " + row + " = " + multi + "   ");
					}  
					System.out.println();
				}
			}
			else {
				System.out.println("서로 다른 두 개의 숫자를 입력해 주세요."); 
			} break;
		}
		input.close();
	}

}
