/* 

Click on  to understand how to write code which can perform basic counting.

Below program has a class CountDemo with a main method. The method receives four integer values as command line arguments. These four integers represent the marks in Maths, Science, Social and English.

Fill the missing code inside the main method such that the program should print the passCount. The passCount should reflect the count of subjects in which the marks scored is greater than or equal to 50.

For example:
Cmd Args : 75 55 65 23
passCount = 3


Note: Please don't change the package name.

*/

package q10928;
public class CountDemo {
	static final int PASS_MARK = 50;
	public static void main(String[] args) {
		int mathsMarks = Integer.parseInt(args[0]);
		int scienceMarks = Integer.parseInt(args[1]);
		// Fill in the missing code to initialize the below fields from arguments passed
		int socialMarks = Integer.parseInt(args[2]);
		int englishMarks = Integer.parseInt(args[3]);
		int passCount = 0;
		// Fill in the missing code here to count
		if (mathsMarks >= 50) {
			++passCount;
		} 
		if (scienceMarks >= 50) {
			++passCount;
		}
		if (socialMarks >= 50) {
			++passCount;
		}
		if (englishMarks >= 50) {
			++passCount;
		}
		System.out.println("passCount = " + passCount);
	}
}