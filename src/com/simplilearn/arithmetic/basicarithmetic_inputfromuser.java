package com.simplilearn.arithmetic;
import java.util.Scanner;
public class basicarithmetic_inputfromuser {

	public static void main(String[] args) {
		// This program gets the input from user and then perform arithmetic operation
		
		System.out.println("Please enter value1::");
		
		Scanner intvalue1 = new Scanner(System.in);
		
		int value1 = intvalue1.nextInt();
		
		System.out.println("Please enter value2::");
		
		Scanner intvalue2 = new Scanner(System.in);
		
		int value2 = intvalue2.nextInt();
		
		System.out.println("The sum of value1 and value2 is ::" + (value1+value2));
		System.out.println("The difference of value1 and value2 is ::" + (value1-value2));
		System.out.println("The product of value1 and value2 is ::" + (value1*value2));
		System.out.println("The division of value1 and ualue2 is ::" + (value1/value2));

		
		

	}

}
