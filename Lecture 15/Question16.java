/* 

Create a class FindNearestNumber with a public method findNearest that takes two parameters first and second are of type int. Find the number that is closer to 100, among first and second.

For example:
Cmd Args : 99 102
99


Hint: There is a useful method called Math.abs(int number) which returns an absolute value for the number passed.
For example:
Math.abs(-3) will return 3
Math.abs(4) will return 4
You may want to use it.



Note: Please don't change the package name.

*/

package q10931;
public class FindNearestNumber {
	public void findNearest(int first , int second) {
		int num1 = Math.abs(first - 100);
		int num2 = Math.abs(second - 100);
		if (num1 < num2) {
			System.out.println(first);
		} else {
			System.out.println(second);
		}
	}
}