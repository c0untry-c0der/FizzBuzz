public class CarLoan {
// I'm confused as to why every line of code is written inside the main method but maybe that'll be explained later on in the course...

// This is a small program to calculate the monthly car payment, including interest, for an auto loan.
	public static void main(String[] args) {
// Declaring the first variables
	    int carLoan = 10000;
	    int loanLength = 3;
	    int interestRate = 5;
	    int downPayment = 2000;

 // Using conditional statements to determine the correct response 
	    if (loanLength <= 0 || interestRate <= 0) {
	      System.out.println("Error! You must take out a valid car loan.");
	    } else if (downPayment >= carLoan) {
	      System.out.println("The car can be paid in full.");
	    } else {
  // Calculating the actual monthly payment on the loan 
	      int remainingBalance = carLoan - downPayment;
	      int months = loanLength * 12;
	      int monthlyBalance = remainingBalance / months;
	      int interest = (monthlyBalance * interestRate) / 100;
	      int monthlyPayment = monthlyBalance + interest;
// Printing out the monthly payment for the customer
	      System.out.println(monthlyPayment);
	       }
	}
}
