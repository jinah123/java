package assignment_04_01;

import java.util.Scanner;

public class Question_06_다른풀이 {

	public static void main(String[] args) {
		double Base;
		double Height;
		double Width;
		char Alpha;
		Scanner input = new Scanner(System.in);
		while (true)
			{	
				System.out.print("Base = ");
				Base = input.nextDouble();
	
				System.out.print("Height = ");
				Height = input.nextDouble();
	
				Width = ( Base * Height ) / 2; 
				System.out.printf("Triangle width = " + "%.1f" , Width ); 
	
				System.out.print("\nContinue? ");
				Alpha = input.next().charAt(0);
				
				if ( ( Alpha == 'y' ) || ( Alpha == 'Y' ) ) 
				{
					continue; 
				}
				if ( ( Alpha != 'y' ) || ( Alpha != 'Y' ) ) 
				{ 
					break; 
				}
	
				input.close();
			}

	}

}
