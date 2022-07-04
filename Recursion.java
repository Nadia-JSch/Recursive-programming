package compulsory_tasks;

public class Recursion {

	// a recursive function to reverse a string input
	public static String revString(String text) {
		
		// base case - there is only one character in the substring left
		if (text.length() == 1) {
			// print the last letter
			System.out.printf(text.substring(0, 1));
			return text.substring(0, 1);
		}
		// recursive case - print the last letter of a the shortened substring 
		else {
			// getting the last letter of the string
			String stringChar = text.substring(text.length() - 1, text.length());
			System.out.printf(stringChar);
			
			// getting a substring that excludes the last letter
			String stringSub = text.substring(0, text.length() - 1);
			
			// call the method again to repeat the process with the new substring
			return revString(stringSub);
		}
	}
	
	
	// global static variables to hold changing Fibonacci equation variables
	static int nextNum = 0;
	static int f0 = 0;
	static int f1 = 1;
	
	// method to print out n numbers of the Fibonnacci sequence
	public static void fibonacci(int n) {

		// stop the recursion before it tries to calculate F0 and F1 
		// as they are the known base cases
		if (n > 1) {
			
			// print the first and second values of 0 and 1 only at the beginning 
			if (f0 == 0 && f1 == 1) {
				System.out.println("The Fibonacci Sequence up to, and including, F" + n + ":");
				System.out.print(f0 + " "); 
				System.out.print(f1 + " ");
			}
			
			// calculating the third value in the sequence
			// F2 = F1 + F0 = 1
			nextNum = f0 + f1;
			System.out.print(nextNum + " ");
			
			// set up the above sum to calculate the next number in the sequence
			// update the variables with the new F(x-1) and F(x-2) values
			f0 = f1;
			f1 = nextNum;
			
			// call the function again 
			fibonacci(n - 1);
		}
		
	}
	
	// main method to call functions
	public static void main(String[] args) {
		
		revString("I like potatoes");
		System.out.println();
		fibonacci(9);
	}
}
