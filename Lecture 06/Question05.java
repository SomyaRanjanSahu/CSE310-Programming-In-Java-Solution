/*

The Integer class wraps a primitive int value.

This class provides constants and methods that are useful while working with int(s).

For example it has a method Integer.parseInt(String s, int radix) which can be used to convert a string value representing a binary, octal, hex or a decimal integer within the valid range of a Integer
int x = Integer.parseInt("B", 16);
//parses the string literal "B" using base-16 and returns decimal 11 as a int

int y = Integer.parseInt("747");
//parses the string literal "747" using base-10 and returns decimal 747 as an int//Note that we need not pass the radix when we want to convert to decimal (or base-10)In the below code, the main method of CalculateDifference will be passed two arguments.
Both the values can be any number between Integer.MIN_VALUE to Integer.MAX_VALUE.

Complete the below code so that it produces the correct output.

Note: You can assume that the first string value passed in args[0] and the second string value passed in args[1] will always contain a decimal number (number represented in base-10, like 2, 3, 4 etc.). It means that you can directly use the Integer.parseInt(text) method without passing any radix for the second parameter.

[Hint: You can convert arg[0] to int by the statement int value = Integer.parseInt(args[0]);]

Note: Please don't change the package name.

Answer :-

*/

package q10771;
public class CalculateDifference {
	public static void main(String[] args) {
		// In the below two lines write code to convert
		// the string value passed in args[0] and args[1] into int values using Integer.parseInt method
		// convert the value in args[0] to int and store in firstValue
		// convert the value in args[1] to int and store in secondValue
		int firstValue = Integer.parseInt(args[0]);
		int secondValue = Integer.parseInt(args[1]);
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}