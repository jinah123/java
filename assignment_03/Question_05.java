package assignment_03;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		
		String Gender;
		int Age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("성별을 입력하시오.: ");
		Gender = input.nextLine();
		Gender = Gender.toUpperCase();
		
		System.out.print("나이를 입력하시오.: ");
		Age = input.nextInt();

		switch ( Gender ) {
		case "M":
			if  (Age >= 18) {
				System.out.println("MAN");
			}
			else if (Age < 18 && Age >= 0 ) {
				System.out.println("BOY");
			}
			break;
		case "F":
			if (Age >= 18) {
				System.out.println("WOMAN");
			}
			else if (Age < 18 && Age >= 0) {
				System.out.println("Girl");
			}
			break;
		default:
			System.out.println("error");
			break;
			
		}
		
		input.close();
	}

}
