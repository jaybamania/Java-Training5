package com.oops;

public class OOPsConcepts {

	public static void main(String[] args) {
		
		
		//OOPs Concept:
//		System.out.println("String : ");
//		System.out.println(12);
//		System.out.println(14.56);
//		System.out.println(true);
//		System.out.println(11);

		B obj_b1 = new B();
		obj_b1.foo();
		obj_b1.printVars();
		
		B obj_b2 = new B(4, 5);
		obj_b2.printVars();
		obj_b2.printVars(10);
		obj_b2.setZ(9);
		System.out.println(obj_b2.getZ());
		// int -> 0, string -> null
	}

}
//class -> Blue printing or structure
//obj -> instance of some class
class A extends C {  // superclass
	int x = 13;
	
	
	
	void foo() {
		System.out.println("A superclass : "+x);
	}



	@Override
	void play() {
		System.out.println("Badminton ");
	}
	
	
}
class D extends C{

	@Override
	void play() {
		System.out.println("Cricket");
	}
	
	@Override
	void eat() {
		System.out.println("Fries");
	}
	
}

class F extends D implements E,G{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
	
	// Int -> Int  => extend
	// class -> class => extend
	//class -> Int => implements

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}
	
}

class B extends A implements G {  //subclass
	
	//
	
	private int z;
	
	
	
//	int getZ() {
//		return this.z;
//	}
//	
//	void setZ(int z) {
//		this.z = z;
//	}
	
	public int getZ() {
		return z;
	}



	public void setZ(int z) {
		this.z = z;
	}

	int a , b; // only declared;
	
	public B() {
		System.out.println("B class is created ");
	}
	
	
	
	public B(int a, int b) {
//		super();
		this.a = a; //will get initialized
		this.b = b;
	}



	@Override
		void foo() {
			// TODO Auto-generated method stub
			System.err.println(x); //13
			System.out.println(this.e);
		}
	
	void printVars() {
		System.out.println("a = "+this.a+", b = "+this.b); //a = 4, b = 5
	}
	
	void printVars(int a) {
		System.out.println("a = "+this.a+", b = "+this.b); //a = 4, b = 5
		System.out.println("a = "+a+", b = "+this.b);  //a = 10, b = 5
	}



	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}
}

abstract class C{
	 abstract void play();
	 
	 void eat() {
		 System.out.println("Burger");
	 }
}
