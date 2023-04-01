package com.promineotech;

import java.lang.reflect.Array;

public class Week3and4Coadingassignment {
static public void main(String[] args ) 
	{
	String[] names = new String [6];
	names [0] = "Sam";	
	names [1] = "Tommy";
	names [2] = "Tim";
	names [3] = "Sally";
	names [4] = "Buck";
	names [5] = "Bob";
	
int[] ages = new int [9];
ages [0] = 3;
ages [1] = 9;
ages [2] = 23;
ages [3] = 64;
ages [4] = 2;
ages [5] = 8;
ages [6] = 28;
ages [7] = 93;
ages [8] = 1;
Double moneyInPocket = 9.50;

int agefirst = ages [0];
int agessecond = ages [Array.getLength(ages)-1];

int number = 3;
int j = agefirst - agessecond;
int sum = printloop(ages);
System.out.println(sum);
	

 System.out.println (j);}

		
public static int printloop (int[] ages ) {

int sum = 0;
for (int numbers : ages) {
sum += numbers;
}
return sum / ages.length ;

}
//public static String three (int number) String = hello {
//for (int i = 0; i < number i++);
//String trying = i += hello
		
// how do you access the first element of the the array? 
// a you put position 0
// how do you acess the last element of the array?
// A. you put position -1

public static boolean willBuyDrink ( moneyInPocket ) {
	boolean isHotOutside;
	if ( isHotOutside && moneyInPocket < 10.50){System.out.println("buying");
}
}
}
