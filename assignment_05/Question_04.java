package assignment_05;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("10개의 정수를 입력하시 : "); 
		int[] numArray = new int[10]; 
		
		int sum = 0; 
		double average = 0.0; 
		
		for (int i=1; i<10; i++ ) 
		{
			numArray[i] = input.nextInt();
			
			if (i%2 == 0) 
			{
				average += numArray[i];
			}
			else  
			{
				sum += numArray[i];
			}
		}	
		System.out.printf("sum : " + sum + "\navg : " + "%.1f",(average/5));
		input.close();
	}

}
