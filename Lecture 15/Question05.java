/* 

Create a class PrintSum with a public method computeSum that takes two parameters firstNo and secondNo are of type int. The program should print the sum of firstNo and secondNo. If firstNo and secondNo are equal it should double the sum and print the output.

These are examples for understanding:
Cmd Args : 23 5
28
Cmd Args : 6 6
24




Note: Please don't change the package name.

*/

package q10920;
public class PrintSum {
	public void computeSum(int firstNo , int secondNo) {
		int sum  = firstNo + secondNo;
		if (firstNo == secondNo) {
			System.out.println(sum+sum);
		} else {
			System.out.println(sum);
		}
	}
}