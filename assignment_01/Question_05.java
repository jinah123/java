package assignment_01;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("yard?");
		double x = input.nextDouble();
		
		double y = 91.44;
		double z = x*y;
		
		System.out.println(x+"yard = "+String.format("%.1f",z)+"cm");
		
		input.close();
	}
}
