package javaPractice3; 

public class dateValidation 
{ 

	static int MAX_VALID_YR = 9999; 
	static int MIN_VALID_YR = 1800; 

	// Returns true if 
	// given year is valid. 
	static boolean isLeap(int year) 
	{ 
		// Return true if year is 
		// a multiple of 4 and not 
		// multiple of 100. 
		// OR year is multiple of 400. 
		return (((year % 4 == 0) && 
				(year % 100 != 0)) || 
				(year % 400 == 0)); 
	} 

	// Returns true if given 
	// year is valid or not. 
	static boolean isValidDate(int d, int m,int y)
							 
	{ 
		// If year, month and day 
		// are not in given range 
		if (y > MAX_VALID_YR || 
			y < MIN_VALID_YR) 
			return false; 
		if (m < 1 || m > 12) 
			return false; 
		if (d < 1 || d > 31) 
			return false; 

		// Handle February month 
		// with leap year 
		if (m == 2) 
		{ 
			if (isLeap(y)) 
				return (d <= 29); 
			else 
				return (d <= 28); 
		} 

		// Months of April, June, 
		// Sept and Nov must have 
		// number of days less than 
		// or equal to 30. 
		if (m == 4 || m == 6 || 
			m == 9 || m == 11) 
			return (d <= 30); 

		return true; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		
	
		
		if (isValidDate(29, 2, 2001)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 

	
	} 
} 


