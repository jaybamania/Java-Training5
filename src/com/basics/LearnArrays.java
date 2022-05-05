package com.basics;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
					//0,1
		int[] intArr = {15,16,5,7,3,1,8,7,10}; //5  //1D Arrays
		
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
		
		//[
		// 5,8,10
		// 17,15,11
		// 27,24,25
		//] 3x3 matrices
		//2x2,2x3,3x2,3x3
		
		int[][] int2DArr = {{5,8,10},{17,15,11},{27,24,25}};
		System.out.println(int2DArr[0].length);
		System.out.println(int2DArr[1][1]);
		System.out.println(int2DArr.length);
		
		for(int i=0; i< int2DArr.length ;i++ ) {
			for(int j=0; j< int2DArr[i].length;j++) {
				System.out.print(int2DArr[i][j]+" , ");
			}
			System.out.println();
		}
		//5,15
		//15,5,7,3,1,8,7,10,16 -> i= 0
		//5,7,3,1,8,7,10,15,16 -> i=1
		//5,3,1,7,8,10,15,16  -> i=2
		int[] unsortArr = {15,16,5,3,1,8,7,10};
//		Arrays.sort(unsortArr);
		
		for(int i =0; i< unsortArr.length-1;i++) {
			for(int j=0; j< unsortArr.length-1;j++) {
				if(unsortArr[j] > unsortArr[j+1]) {
					int temp = unsortArr[j]; //j = 15, temp = 15, j+1 = 5
					unsortArr[j] = unsortArr[j+1]; // j = 5, j+1 = 5, temp = 15
					unsortArr[j+1] = temp;// j+1 = 15, temp =15
				}
			}
		}
//		
		
		System.out.println("Ascending Order : ");
		for(int j=0; j< unsortArr.length;j++) {
			System.out.print(unsortArr[j]+" , ");
		}
		
		for(int i =0; i< unsortArr.length-1;i++) {
			for(int j=0; j< unsortArr.length-1;j++) {
				if(unsortArr[j] < unsortArr[j+1]) {
					int temp = unsortArr[j]; //j = 15, temp = 15, j+1 = 5
					unsortArr[j] = unsortArr[j+1]; // j = 5, j+1 = 5, temp = 15
					unsortArr[j+1] = temp;// j+1 = 15, temp =15
				}
			}
		}
		
		System.out.println("Descending Order : ");
		for(int j=0; j< unsortArr.length;j++) {
			System.out.print(unsortArr[j]+" , ");
		}

	}

}
