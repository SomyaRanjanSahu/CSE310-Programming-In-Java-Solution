/* 

Write a class TransposeMatrix with a public method transposeMatrix that takes one parameter matrix1 of type int[][] which returns the transpose of the given matrix.

Consider the following example for your undertanding:
Matrix:
Enter number of rows: 3
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 3 4
Enter row 3: 5 6
Transpose of given matrices is:
1 3 5
2 4 6


Note: Please don't change the package name.

*/

package q11105;
public class TransposeMatrix {
/**
	 * Computes the transpose of the given matrix. 
	 * 
	 * @return the resultant matrix
	 */
	
public int[][] transposeMatrix(int[][] matrix1) {
		
		// Write the code
		int row = matrix1.length, col = matrix1[0].length;
		
		int t[][] = new int[col][row];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				t[j][i] = matrix1[i][j];
			}
		}
		return t;
	}
}