package com.tamal.Learning;

public class Tempo extends Polymorphism {

	void drive()
	  {
	    System.out.println("Driving a Tempo");
	  }
}

class FinalImplementation {
	public static void main(String[] args){
		Polymorphism p1 =new Car();
		p1.drive();
	}
}