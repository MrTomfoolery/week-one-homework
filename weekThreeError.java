package com.promineotech;

import java.lang.reflect.Array;
import java.util.Scanner;

public class weekthreeError {
	public static void main(String[] args) {
		//
		// Copyright (c) 2023 Promineo Tech
		// Author:  Promineo Tech Academic Team
		// Subject: Arrays & Methods
		// Java Week 03 Lab
		//
		package week03;

		public class Week03ArraysAndMethodsLab {

			public static void main(String[] args) {
					
				//
				// Arrays:
				//
				
				// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
int[] value = new int [6];
		value[0] = 1;
		value[1] = 5;
		value[2] = 2;
		value[3] = 8;
		value[4] = 13;
		value[5] = 6;
				// 2. Print out the first element in the array
			System.out.println(value[0]);
				
				// 3. Print out the last element in the array without using the number 5
				System.out.println(value[7]-2);
				
				// 4. Print out the element in the array at position 6, what happens?

				//System.out.println(value[6]);
				//makes a error message cause there is no array for six
				// 5. Print out the element in the array at position -1, what happens?
				//System.out.println(value[-1]); 
				// new error message
				// 6. Write a traditional for loop that prints out each element in the array
			for (int a = 0; a < value.length; a++) { System.out.println(value[a]);
					
				// 7. Write an enhanced for loop that prints out each element in the array
				for (int number : value) { System.out.println (number);
				// 8. Create a new variable called sum, write a loop that adds 
				//			each element in the array to the sum
               int sum = 0;
                for (int number : value) {	sum += number; System.out.println(sum);
                }
                }
				// 9. Create a new variable called average and assign the average value of the array to it
             int average = sum / Array.Length; 
             System.out.println(average);
				
				// 10. Write an enhanced for loop that prints out each number in the array 
				//			only if the number is odd
                 for (int number : value) {  
				 if (number % 2 == 1) {
				// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
                String[] people = new string[4];
                people [0] = "sam";
                people [1] = "sally";
                people [2] = "thomas";
                people [4] = "robert";
				// 12. Calculate the sum of all the letters in the new array
int characterlength = 0;
for (String people : peoples) { charcterlength += people.length();
				

				//
				// Methods:
				//
				
				// 13. Write and test a method that takes a String name and prints out a greeting. 
				//			This method returns nothing.
greeting ("victor");
				
				// 14. Write and test a method that takes a String name and  
				//			returns a greeting.  Do not print in the method.
                String = greetingsagain ("james");
				
				// Compare method 13 and method 14:  
				//		a. Analyze the difference between these two methods.
				//		b. What do you find? 
				//		c. How are they different?
				// If you are making a method as in the 13 it will use the process.
				 // in 14 you did not make a end for the method to print.
				// 15. Write and test a method that takes a String and an int and 
				//			returns true if the number of letters in the string is greater than the int
				System.out.println(stringlenghcheck("konichiwa,5"));
				
				// 16. Write and test a method that takes an array of string and a string and 
				//			returns true if the string passed in exists in the array
				System.out.println(Istherestring(people, "arrrg"));
				
				// 17. Write and test a method that takes an array of int and 
				//			returns the smallest number in the array
			System.out.println(tinyestnumber(array);
				
				// 18. Write and test a method that takes an array of double and 
				//			returns the average
				

				// 19. Write and test a method that takes an array of Strings and 
				//			returns an array of int where each element
				//			matches the length of the string at that position

						
				// 20. Write and test a method that takes an array of strings and 
				//			returns true if the sum of letters for all strings with an even amount of letters
				//			is greater than the sum of those with an odd amount of letters.

			
				// 21. Write and test a method that takes a string and 
				//			returns true if the string is a palindrome

				
				
			}
			

			
			


			

			
			

			
			// Method 16
				 }public static boolean Istherestring(String)[] array, String string) {
	for { (string str : array) {  
if (str == (string) { return true;
}	
else return false;
// Method 17:
	} public static int tinyestnumber(int)[] numbers) { 
	int smallest = number[0];
	if (number < smallest)}
smallest = number;
	}
}
			return smallest;
			// Method 18:

			
			// Method 19:

			
			// Method 20:
			
			
			// Method 21:
			

		// Method 13:
				 public void greeting(String billy) {
				 System.out.println(hello " + billy + "!" );}
				
				 
				 }// Method 14:
			public static String  greetingsagain	 (String = wendy) {
				 return "hello " + wendy + "!";}";
				 		
                 }// Method 15:
			public static boolean stringlengthcheck(String string, int number) {
			if (string.length() > number)	
			}
			 return true;
                 } else {return false;
			 }
