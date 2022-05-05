package com.basics;

public class TotalDatatypes {

	public static void main(String[] args) {
			
		boolean result = true;
		char capitalC = 'C';
		byte b = 127; // 1byt = 8bits= 00000000, 11111111
		short s = 32767;
		int i = 10000000; //Max val =>  pow(2,32)-1
		
		int decVal = 30;
		int hexVal = 0x1e;
		int binVal = 0b11110;
		
		double d1 = 123.4;
		float f1  = 123.4f;
		
		long creditCardNumber = 1234_5678_9012_3456L;
		
		System.out.println("Boolean value : "+result);
		System.out.println("Char value : "+capitalC);
		System.out.println("Byte value : "+b);
		System.out.println("Short value : "+s);
		System.out.println("Int value : "+i);
		
		System.out.println("====================");
		
		System.out.println("Decimal value : "+decVal);
		System.out.println("Hexadec value : "+hexVal);
		System.out.println("Binary value : "+binVal);
		
		System.out.println("====================");
		
		System.out.println("Double value : "+d1);
		System.out.println("Float value : "+f1);
		
		System.out.println("====================");
		
		System.out.println("Long value : "+creditCardNumber);
	}

}
