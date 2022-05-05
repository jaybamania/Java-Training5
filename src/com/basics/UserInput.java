package com.basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter the value for a : ");
////		int a = sc.nextInt();
//		String a = sc.next();
//		
//		System.out.println("The value of a : "+a);
		
		//Switch Case Example
//		switch(a.toUpperCase()) {
//
//		case "A":
//			System.out.println("It is vowel "+a);
//			break;
//		case "E":
//			System.out.println("It is vowel "+a);
//			break;
//		case "I":
//			System.out.println("It is vowel "+a);
//			break;
//		case "O":
//			System.out.println("It is vowel "+a);
//			break;
//		case "U":
//			System.out.println("It is vowel "+a);
//			break;
//		default:
//			System.out.println("It's not vowel "+a);
//	}
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("Enter the value for a : ");
//			int a = sc.nextInt();
			String a = sc.next();
			
			System.out.println("The value of a : "+a);
			if(a.equals("q")) {
				System.out.println("Exiting....");
				isTrue = false;
				break;
			}
			switch(a.toUpperCase()) {

			case "A":
				System.out.println("It is vowel "+a);
				break;
			case "E":
				System.out.println("It is vowel "+a);
				break;
			case "I":
				System.out.println("It is vowel "+a);
				break;
			case "O":
				System.out.println("It is vowel "+a);
				break;
			case "U":
				System.out.println("It is vowel "+a);
				break;
			default:
				System.out.println("It's not vowel "+a);
		}

	}
		}

}

