/* 

The class MultiDimArrayPrinter with a main method. The program prints a multidimensional array of integers.

The code in the main method uses a for-each loop to iterate over the multidimensional array intArr and prints the values.

Understand and retype the code below.

Note: Please don't change the package name.

*/

package q10946;
public class MultiDimArrayPrinter {
	public static void main(String[] args) {
		int[][] int2DArr = {
							{1},
							{2, 3},
							{4, 5, 6},
							{7, 8, 9, 10}
						};
		for (int[] arr : int2DArr) {
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}