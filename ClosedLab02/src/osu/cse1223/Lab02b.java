/*
 * Lab02b.java
 *prompt the user for two sides of a rectangle and find the perimeter, area
 *and length og the length of the rectangle
 * 
 * @author Paul Onderisin
 * @verison 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Lab02b {

	public static void main(String[] args) {
		
		//Sets the scanner var
		Scanner in = new Scanner(System.in);
		
		//prompts the user for the first length
		System.out.print("Enter the length of the first side: ");

		//Gets the input from the user and places it in a double
		double sideA = in.nextDouble();
		
		//prompt the user for the second length
		System.out.print("Enter the length of the second side: ");
		
		//Gets the input from the user and places it in a double
		double sideB = in.nextDouble();
		
		//Displays the perimeter of the rectangle
		System.out.println("The perimeter of your rectangle is: " + (sideA*2 + sideB*2));
		
		//Displays the area of the rectangle
		System.out.println("The perimeter of your rectangle is: " + (sideA * sideB));
		
		
		//Logic to get the Diaagonal side
		double sideC = Math.sqrt((sideA*sideA )+ (sideB*sideB));
		
		//Finds the length of the diagonal of the rectangle
		System.out.println("The length of the diagonal of your rectangle is: " + sideC);
		
		//displays goodbye to the user
		System.out.println("Goodbye!");
		
		//Closes the scanner
		in.close();
	}

}
