package com.promineotech;

import java.util.Scanner;

public class weektwochallenge {
	public static void main(String[] args) {

	

int Inaccuratecredentials = 1;
boolean loggedIn = false;
Scanner sc= new Scanner(System.in);    
while (!loggedIn && Inaccuratecredentials <=2) {
System.out.print("Enter username: ");   
String username = sc.nextLine();   
System.out.print("Enter password: ");  
String password = sc.nextLine();   
if (username.equals("samy123") && password.equals("12345") && (Inaccuratecredentials <=2) ) {
System.out.println("Welcome back " + username);
loggedIn = true; ; Inaccuratecredentials++;
    } switch (Inaccuratecredentials)  { case 1: Inaccuratecredentials += 1;
System.out.println("Inaccuratecredentials"); 
break;
    case 2: Inaccuratecredentials += 2;
    System.out.println("sorry out of trys"); 
 break; 
 default: System.out.print("stop out of trys");
} // end of else 
} // end of while


	}

}
