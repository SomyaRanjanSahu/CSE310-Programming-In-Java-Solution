/* 

Write a class Factorial with a main method. The method takes one command line argument. Write a logic to find the factorial of a given argument and print the output.

For example:
Cmd Args : 5
Factorial of 5 is 120


Note: Please don't change the package name.

*/

package q10886;
public class Factorial {
	public static void main(String[] args) {
		int factorial = 1;
		int n = Integer.parseInt(args[0]);
		for (int i=2; i<=n; i++) {
			factorial = factorial *i;
		}
		System.out.println("Factorial of " + n + " is " + factorial);
	}
}