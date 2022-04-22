package assignment_05;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("6명의 몸무게를 입력해 주세요 : "); 
		double[] weight = new double[6]; 
		
		double sum = 0;
		
		for (int i = 0; i < 6; i++)  
		{
			weight[i] = input.nextDouble();
			sum += weight[i]; 
		}
		
		System.out.printf("%.1f",(sum/6)); 
		
		input.close();

	}

}
