/* 

Create a class NumberEndingCheck with a public method checkNumberEnding that takes two parameters first and second are of type int. The program should print true if both the first and second are ends with the same digit otherwise, it should print false.

For Example:
Cmd Args : 55 75
true


Hint: The % operator can be used to find the remainder after division by a number.

Note: Please don't change the package name.

*/

package q10932;
public class NumberEndingCheck {
	public void checkNumberEnding(int first , int second) {
		int end1 = first % 10;
		int end2 = second % 10;
		if(end1 == end2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}