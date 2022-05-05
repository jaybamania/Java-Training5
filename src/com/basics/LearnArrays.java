package com.basics;

public class LearnArrays {

	public static void main(String[] args) {
					//0,1
		int[] intArr = {1,2,3,4,5,6,7,8,9,10}; //5
		
		char[] charArr = {'a','e','i','o','u'};
		
		System.out.println("Length of Array : "+intArr.length);
		
		System.out.println("Element at Index 3 : "+intArr[3]);
		
		System.out.println("Element at Index 3 : "+charArr[3]);
		
//		for(I[]=0; I[]<5; I[]++);
//		System.out.println(I[]);
		//0,1,2,3,4,5
		for(int i= 0;i <= intArr.length-1;i=i+2) {
			System.out.print(intArr[i]+" , ");
		}
		System.out.println();
		for(int i= 0;i <= charArr.length-1;i++) {
			System.out.println("The element at index "+i+" is "+charArr[i]);
		}
		
		System.out.println("============== Enhanced For loop ==============");
		//enhanced forloop
		for(int i:intArr) {
			if(i%2 != 0) {
				System.out.println("Odd : "+i);
			}else {
				System.out.println("Even : "+i);
			}
		}
		
		for(char c:charArr) {
			System.out.println(c);
		}
		
		

	}

}
