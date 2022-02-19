/* 

See and retype the below code to understand how conditional operators are used.

Note: Please don't change the package name.

*/

package q10833;
public class ConditionalOperatorsDemo {
	public static void main(String[] args) {
		boolean noWorkInOffice = true;
		boolean isTodaySunday = false;
		boolean canTakeLeave = true;
		if (isTodaySunday || (noWorkInOffice && canTakeLeave)) {
			System.out.println("I am fishing...");
		}
	}
}