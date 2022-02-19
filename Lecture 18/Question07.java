/* 

Write a class MultiplicationOfMatrix with a public method multiplication which returns the multiplication result of its arguments. if the first argument column size is not equal to the row size of the second argument, then the method should return null.

Consider the following example for your understanding
Matrix 1:
Enter number of rows: 3
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 4 5
Enter row 3: 7 8
Matrix 2:
Enter number of rows: 2
Enter number of columns: 3
Enter 3 numbers separated by space
Enter row 1: 1 2 3
Enter row 2: 4 5 6
Multiplication of the two given matrices is:
9 12 15
24 33 42
39 54 69
Matrix 1:
Enter number of rows: 2
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 3 4
Matrix 2:
Enter number of rows: 3
Enter number of columns: 2
Enter 2 numbers separated by space
Enter row 1: 1 2
Enter row 2: 4 5
Enter row 3: 2 3
Multiplication of matrices is not possible


Note: Please don't change the package name.

*/

package q11106;
public class MultiplicationOfMatrix{
	public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
		/*Return the result if the matrix1 coloumn size is equal to matrix2 row size and print the result.
		* @Return null.
		*/
		// Write your logic here for matrix multiplication
		int r1 = matrix1.length, c1 = matrix1[0].length;
		int r2 = matrix2.length, c2 = matrix2[0].length;
		int mul[][] = new int[r1][c2];
		
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				mul[i][j] = 0;
				for(int k = 0; k < r2; k++) {
					if(r2 == c1) {
						mul[i][j] += matrix1[i][k] * matrix2[k][j];
					} else {
						return null;
					}
				}
			}
		}
		return mul;
	}
}