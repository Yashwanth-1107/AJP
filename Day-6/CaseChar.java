package com.ajp;

import java.util.Scanner;

public class CaseChar {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter a letter");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'A':System.out.println("choosen value=A");
		break;
		case 'B':System.out.println("choosen value=B");
		break;
		case 'C':System.out.println("choosen value=C");
		break;
		case 'D':System.out.println("choosen value=d");
		break;
		case 'E':System.out.println("choosen value=e");
		break;
		default:System.out.println("choosen invalid");

		}
		
		}
		

}