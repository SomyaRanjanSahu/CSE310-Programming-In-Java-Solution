/* 

Assume there is a class called Bank with method calculateInterest(float principal, int time).

Create sub-classes of Bank with names SBI, ICICI and AXIS and override the calculateInterest(float principal, int time) method.

Create a constant of type float called INTEREST_RATE in classes SBI, ICICI and AXIS with values 10.8, 11.6 and 12.3 respectively.

Use the formula (principal * INTEREST_RATE * time) / 100 to calculate the interest for given principal and time and return the value as float in the overriden method.

For example, if the two arguments passed to the main method are 1000 and 5, (principal and time) below is the expected output:
SBI rate of interest = 540.0
ICICI rate of interest = 580.0
AXIS rate of interest = 615.0


Note: Please don't change the package name.

*/

package q11271;
class Bank {
	float calculateInterest(float principal, int time)	{
		return 0;
	}
}
class SBI extends Bank{
	private static final float INTEREST_RATE = 10.8f;
	
	float calculateInterest(float p, int t){
		return(p*t*INTEREST_RATE)/100;
	}
	
}
class ICICI extends Bank{
	private static final float INTEREST_RATE = 11.6f;
	
	float calculateInterest(float p, int t){
		return (p*INTEREST_RATE*t)/100;
	}
}
