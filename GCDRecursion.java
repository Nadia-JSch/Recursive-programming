package compulsory_tasks;


public class GCDRecursion {

	public static int commonFactor(int x, int y) {
		
		// base case - when there is no remainder between the current divisor and dividend
		if ( x % y == 0) {
			return y;
		}
		
		// recursive case - find the remainder of the two numbers and update the equation
		else {
		int remainder = x % y;
		
		// By the Euclidean equation:
		// the divisor becomes the dividend  x = y
		// the remainder becomes the new divisor y = previous remainder
		x = y;
		y = remainder;
		
		return commonFactor(x, y);
		}
	}
	
	// main method
	public static void main(String[] args) {
		System.out.println(commonFactor(72, 120));
	}
	
}


