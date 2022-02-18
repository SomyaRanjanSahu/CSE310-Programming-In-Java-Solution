/*

See the code and retype the same.

Note how an int data type can be assigned values from binary, octal and hex and character literals.

In case the value happens to be a char literal, their Unicode value is assigned.
Note: The initial 256 characters of the ASCII character set are the same in Unicode character set.

Note: Please don't change the package name.

Answer :-

*/

package q10770;
public class IntegerDemo {
	public static void main(String args[]) {
		int decimalOne = 1;
		System.out.println("decimalOne = " + decimalOne);
		int binaryThree = 0b11;
		System.out.println("binaryThree = " + binaryThree);
		int octalEight = 010;
		System.out.println("octalEight = " + octalEight);
		int hexTen = 0xA;
		System.out.println("hexTen = " + hexTen);
		int unicodeValueOfOne = '1';
		System.out.println("unicodeValueOfOne = " + unicodeValueOfOne);
		int unicodeValueOfA = 'A';
		System.out.println("unicodeValueOfA = " + unicodeValueOfA);
		int unicodeValueOfZ = 'Z';
		System.out.println("unicodeValueOfZ = " + unicodeValueOfZ);
	}
}