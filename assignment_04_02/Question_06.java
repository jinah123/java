package assignment_04_02;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("1~100 사이의 숫자를 입력해 주세요 : "); 
		int x = input.nextInt();
		
		if ( x <= 0 || x >100 ) 
		{
			System.out.println("올바른 값을 입력해 주세요.");
		}
		else 
		{
			for ( int i=1; i<100; i++ ) 
			{			
				int k = x*i;
				System.out.print( k + " " ); 
				
				if ( k%10 == 0 ) 
				{
					break;
				}
			}
		}
		input.close();

	}

}
