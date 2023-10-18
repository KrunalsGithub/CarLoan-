public class CarLoan {
	public static void main(String[] args) {

int carLoan = 10000; //value of carLoan
int loanLength = 3; //time period of the loan
int interestRate = 5; //interest rate value 

int downPayment = 2000; //value of downpayment 
/*if the loan length is less than or equal to 0 OR the interest
rate is less than or equal to 0, the system prints out error message */
if (loanLength <= 0 || interestRate <= 0) { 
    System.out.println("Error! You must take out a valid car loan.");
/*else if the downpayment value is greater than or equal to the car 
loan, the following print statement is printed */
} else if (downPayment >= carLoan){ 
  System.out.println("The car can be paid in full.");
/* if the top two boolean expressions are false, the following calculations are made in order to calculate for the monthly 
payment value */
} else {
  int remainingBalance = (carLoan - downPayment);
  int months = (loanLength * 12); 
  int monthlyBalance = (remainingBalance / months);
  int interest = (monthlyBalance * interestRate) / 100; 
  int monthlyPayment = (monthlyBalance + interest);
  System.out.println(monthlyPayment); //monthly payment is printed

  }

	}
}
