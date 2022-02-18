/* 

The Short class wraps a primitive short value.
This class provides constants and methods that are useful while working with shorts. For example it has a method Short.parseShort(String s, int radix) which can be used to convert a string value representing a binary, octal, hex or a decimal integer within the valid range of a short
short x = Short.parseShort("A", 16);
//parses the string literal "A" using base-16 and returns decimal 10 as a short

short y = Short.parseShort("3203");
//parses the string literal "3203" using base-10 (by default) and returns decimal 3203 as a short
In the below code, the main method in the class GuessShort will be passed one argument in args. The argument can be any number between -32,768 to 32,767.
You can assume that the string value passed in args[0] will always contain a number represented in base-10.
Here the program will check the given number is in the range of byte or not.
Complete the below code so that it produces the correct output.


Note: Please don't change the package name.

Answer :-

*/

package q10775;
public class GuessShort {
	public static void main(String[] args) {
		//in the below line write code to convert
		//the string value passed in args[0] into a short
		//Hint: Since args[0] is going to be a String 
		// you can use Short.parseShort(args[0]); to convert
		// the value in args[0] into a short
		short shortValue = Short.parseShort(args[0]);  
		
		if (Byte.MIN_VALUE <= shortValue && shortValue <= Byte.MAX_VALUE) {
			System.out.println("The short value " + shortValue + " is in the range of a byte ");
		} else {
			System.out.println("The short value in args[0] is : " + shortValue);
		}
	}
}