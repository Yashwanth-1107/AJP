package com.ajp;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		switch(num) {
		case 0:System.out.println("choosen value=0");
		break;
		case 1:System.out.println("choosen value=1");
		break;
		case 2:System.out.println("choosen value=2");
		break;
		case 3:System.out.println("choosen value=3");
		break;
		case 4:System.out.println("choosen value=4");
		break;
		default:System.out.println("choosen invalid");

		}
		
		}
		

}
		
