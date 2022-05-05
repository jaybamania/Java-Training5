package com.basics;

public class StringComparison {
	
	private String s1,s2;
	
	public StringComparison() {
		// TODO Auto-generated constructor stub
	}

	public StringComparison(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringComparison obj = new StringComparison("Comparison", "comparison");
		System.out.println(obj.compareString());
		System.out.println(obj.toString());
		
	}
	
	public boolean compareString() {
		
		if(this.s1 == this.s2) return true;
		
		return false;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	

}
