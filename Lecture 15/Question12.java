/* 

Create a class RangeCheck with a public method checkRange that takes two parameters first and second are of type int. If one of the numbers is within the range of 25 to 35 (both inclusive) the program should print Within range, otherwise it should print Out of range.

For example:
Cmd Args : 25 79
Within range
Note: Please don't change the package name.

*/

package q10927;
public class RangeCheck {
	public void checkRange(int first , int second) {
		if( (first >= 25 && first <= 35) || (second >= 25 && second <= 35) ) {
			System.out.println("Within range");
		} else {
			System.out.println("Out of range");
		}
	}
}