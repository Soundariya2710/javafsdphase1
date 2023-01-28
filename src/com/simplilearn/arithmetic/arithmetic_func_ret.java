package com.simplilearn.arithmetic;

public class arithmetic_func_ret {

	public static void main(String[] args) {
		// To perform arithmetic operations and printing the output returned from functios
		System.out.println("The sum of two numbers is ::"+ sum(200,360));
		System.out.println("The differnce of two numbers is ::"+ diff(200,169));
		System.out.println("The product of two numbers is ::"+ mul(200,360));
		System.out.println("The division  of two numbers is ::"+ div(200,5));
		

	}
	 public static int sum(int val1, int val2) {
		  
		 return (val1 + val2);
	 }
	
	 public static int diff(int val1, int val2) {
		  
		 return (val1 - val2);
	 }
	 
	 public static int mul(int val1, int val2) {
		  
		 return (val1 * val2);
	 }
	 
	 public static int div(int val1, int val2) {
		  
		 return (val1 / val2);
	 }

}
