package com.question1;

public class SwapTwoNumberWithoutTempVar {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//20
		a=a-b;//10
		
		System.out.println("After swap a="+a);
		System.out.println("After swap b="+b);

	}

}
