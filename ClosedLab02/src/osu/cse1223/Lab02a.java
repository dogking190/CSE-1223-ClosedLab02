/*
 * Lab02a.java
 * The program will prompt user for their name 
 * and then give information about their name
 * 
 * If no name is entered then charAt() throws a error
 * and stops the program
 * 
 * @author Paul Onderisin
 * @verison 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Lab02a {

	public static void main(String[] args) {
		
		//Scanner Var to get user input		
		Scanner in = new Scanner(System.in);
		
		//Prompts user for their name
		System.out.print("What is Your Name? ");
		
		//Gets user input for name
		String name = in.nextLine();
		
		//Welcomes the user to the program
		System.out.println("Hello " + name + "!");
		
		//Says how long the person's name is
		System.out.println("Your name is " + name.length() + " letters long");
		
		//Says what letter the name beguins with
		System.out.println("Your name starts with a " + name.charAt(0));
		
		//Says what letter the name ends with
		System.out.println("Your name ends with a " + name.charAt(name.length() -1));
		
		//prints goodbye + name to the screen
		System.out.println("Goodbye " + name + "!");
		
		//Closes the scanner
		in.close();
		

	}

}
