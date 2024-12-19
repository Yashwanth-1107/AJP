package com.ajp;

public class OutsideClassSamePackage {
	
	public static void main(String[] args) {
		Withinclass nani=new Withinclass();
		nani.name="lorry";
		nani.capacity=100;
		nani.numberplate=1928;
		nani.setMillage(21);
		
		System.out.println("Details"+nani.name+","+nani.capacity+","+nani.numberplate+","+","+nani.getMillage());
	}

}
