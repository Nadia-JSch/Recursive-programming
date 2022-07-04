package compulsory_tasks;

import java.util.Scanner;

public class SearchReplace {

	// recursive method to replace part of an entered string
	public static void searchReplace(String oldString, String subString, String newString) {
	
		// base case - print the string when it contains the replaced string in it
		if (oldString.contains(newString)) {
			System.out.println("The new string is: ");
			System.out.println(oldString);
		}
		
		// recursive case - replace the contents within the function call
		else {
			searchReplace(oldString.replace(subString, newString), subString, newString);
		}
	}

	// main method
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner userInput = new Scanner(System.in); 
		
		// Get user input
		System.out.println("Please enter a string: ");
		String oldString = userInput.nextLine();
		
		System.out.println("Please enter a substring to find: ");
		String toSub = userInput.nextLine();
		
		System.out.println("Enter a string to replace the substring with: ");
		String newSub = userInput.nextLine();
		
		// call the method with arguments passed
		searchReplace(oldString, toSub, newSub);
	}
}
