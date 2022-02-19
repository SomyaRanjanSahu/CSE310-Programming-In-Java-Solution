/* 

Write a class AdditionOfMatrix with a public method add which returns the sum of its arguments. If the two arguments are not matrices of the same size, then the method should return null.

Consider the following examples for your understanding:
Matrix 1:
Enter number of rows: 2
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 3 4
Matrix 2:
Enter number of rows: 2
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 4 5
Enter row 2: 6 7
Sum of the two given matrices is:
5 7
9 11
Matrix 1:
Enter number of rows: 2
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 3 4
Matrix 2:
Enter number of rows: 2
Enter number of columns: 3
Enter 3 numbers separated by space
Enter row 1: 1 2 3
Enter row 2: 4 5 6
Addition of different sized matrices is not possible


Note: Please don't change the package name. 

*/

package q11053;
public class AdditionOfMatrix {
	
	/**
	 * Computes the addition of the two given matrices if the sizes of the matrices are the same. 
	 * Otherwise, returns null.
	 * 
	 * @return the resultant matrix, null if addition is not possible 
	 */
	public int[][] add(int[][] matrix1, int[][] matrix2) {
		// Write the code
		
		int r1 = matrix1.length, c1 = matrix1[0].length;
		int r2 = matrix2.length, c2 = matrix2[0].length;
		
		int[][] sum = new int[r1][c1];
		for (int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				if (r1 == r2 && c1 == c2)
					sum[i][j] = matrix1[i][j] + matrix2[i][j];
				else
					return null;
			}
		}
		return sum;
	}
}