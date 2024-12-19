package com.ajp;

import com.avanthi.Car;

public class  CarDemo extends Car {

	public static void main(String[] args) {
		//Car car=new Car();
		//car.speed=250;
		
		CarDemo cad=new CarDemo();
		cad.name="BMW";
		cad.speed=300;
		cad.setMillage(25);
		
		System.out.println("Car details" +cad.name+","+cad.speed+","+cad.getMillage());


	}

}
