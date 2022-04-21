package assignment_04_01;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		double Base;
		double Height;
		double Width;
		char Alpha;
		Scanner input = new Scanner ( System.in );

		do {
			System.out.print("Base = ");
			Base = input.nextDouble();

			System.out.print("Height = ");
			Height = input.nextDouble();

			Width = ( Base * Height ) / 2; 
			System.out.printf("Triangle width = " + "%.1f" , Width ); 

			System.out.print("\nContinue? ");
			Alpha = input.next().charAt(0);

		} while (( Alpha == 'y' ) || ( Alpha == 'Y' ));
			
		input.close();
		}

	}
