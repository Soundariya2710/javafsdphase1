package com.simplilearn.arithmetic;
import java.util.Scanner;

public class arithmetic_voidfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
	        System.out.println("Please enter value1::");
			
			Scanner intval1 = new Scanner(System.in);
			
			int value1 = intval1.nextInt();
			
			System.out.println("Please enter value2::");
			
			Scanner intval2 = new Scanner(System.in);
			
			int value2 = intval2.nextInt();
			
			arithmetic_voidfunc arithmetic1 = new arithmetic_voidfunc();
			
			arithmetic1.function1(value1,value2);
			arithmetic1.function1();
			
			

		}
	 public void function1() {
		 
		    int val1 = 400;
			int val2 = 25;
			
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("*********  output of non parameterised function  ****");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		    System.out.println("The sum of val1 and val2 is ::" + (val1+val2));
			System.out.println("The difference of val1 and val2 is ::" + (val1-val2));
			System.out.println("The product of val1 and val2 is ::" + (val1*val2));
			System.out.println("The division of val1 and val2 is ::" + (val1/val2));
	 }
	 
	 public void function1(int value1, int value2) {
		 
		    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		    System.out.println("************  output of parametersed function ******");
		    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		    System.out.println("The sum of val1 and val2 is ::" + (value1+value2));
			System.out.println("The difference of val1 and val2 is ::" + (value1-value2));
			System.out.println("The product of val1 and val2 is ::" + (value1*value2));
			System.out.println("The division of val1 and val2 is ::" + (value1/value2));
	}
	 
	

	}


