package com.avanthi;

public class EvenOod {
	void check(int num) {
		if(num%2==0)
			System.out.println(num+"is even");
		else
			System.out.println(num+"is odd");
	}
		public static void main(String[] args) {
			int num=15;
			EvenOod yash=new EvenOod();
			yash.check(num);
			
	}

}
