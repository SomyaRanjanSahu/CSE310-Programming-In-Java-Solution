/* 

Write a Java program for creation of illustrating throw.

Write a class ThrowExample contains a method checkEligibilty(int age, int weight) which throws an ArithmeticException with a message "Student is not eligible for registration" when age < 12 and weight < 40, otherwise it prints "Student Entry is Valid!!".

Write the main() method in the same class which will receive two arguments as age and weight, convert them into integers.

For example, if the given data is 9 and 35 then the output should be:
Welcome to the Registration process!!
java.lang.ArithmeticException: Student is not eligible for registration
For example, if the given data is 15 and 41 then the output should be:
Welcome to the Registration process!!
Student Entry is Valid!!
Have a nice day


Note: Please don't change the package name.

*/

package q11335;
public class ThrowExample {
	public static void main(String args[]) {
		int age = Integer.parseInt(args[0]);
		int weight = Integer.parseInt(args[1]);
		System.out.println("Welcome to the Registration process!!");
		try {
			checkEligibilty(age,weight); // Fill the missing code
			System.out.println("Have a nice day");
		}
		catch(Exception e) { // Fill the missing code
			System.out.println("java.lang.ArithmeticException: Student is not eligible for registration"); // Fill the missing code
		}
	}
	static void checkEligibilty(int age, int weight) {
		if(age<12 && weight<40) { // Write the condition
			throw new ArithmeticException("Student is not eligible for registration"); // Fill the missing code
		} else {
			System.out.println("Student Entry is Valid!!");
		}
	}
}