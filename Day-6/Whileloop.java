package com.ajp;

import java.util.Scanner;

public class Whileloop {
	public static void main(String[] args) {
		
	    Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startingNum = scanner.nextInt();
		System.out.println("Enter the ending number");
		int endingNum = scanner.nextInt();
		
		int sum =0;
		int number = startingNum;
		while (number<=endingNum) {
			
			System.out.println(number);
			sum+=number;
			number++;
			
		}
		
		System.out.println("sum of first 50 numbers"+sum);
}
}

