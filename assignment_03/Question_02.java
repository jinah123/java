package assignment_03;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {

		String alphabet;

		Scanner input = new Scanner(System.in);
		System.out.print("영문 대문자를 입력하시오: ");

		alphabet = input.next();
		alphabet = alphabet.toUpperCase();

		String Grade; 
		switch (alphabet){
		case "A":
			Grade = "Excellent";
			break;
		case "B": 
			Grade = "Good";
			break;
		case "C":
			Grade = "Usually";
			break;
		case "D": 
			Grade = "Effort";
			break;
		case "F":
			Grade = "failure";
			break;
		default:
			Grade = "error";
			break;
		}

		System.out.println(Grade);
		input.close();
	}

}
