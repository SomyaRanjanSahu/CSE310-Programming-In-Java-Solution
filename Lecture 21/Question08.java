/* 

Write a class ElementCheck with a public method elementFinder that takes one parameter arr of type int[] and returns true if the first four elements in the arr contains number 4 else returns false.

Assumptions:
arr is never null
Length of arr may be less than four
These are examples for understanding:
Cmd Args : 36 51 42 4
true
Cmd Args : 1 2
false


Note: Please don't change the package name.

*/

package q11056;

public class ElementCheck {
	
	/**
	 * Find if the first four elements in the array contains number 4 or not
	 * 
	 * 
	 * @return result
	 */
	 
	public boolean elementFinder(int[] arr) {
		
		//Write your code here
		int count = 0;
		if (arr.length < 4) {
			for(int i=0; i<arr.length; i++){
				if(arr[i] == 4) {
					count++;
				}
			}
		}
		else {
			for( int i=0; i<4;i++) {
				if(arr[i] == 4) {
					count++;
				}
			}
		}
		if(count == 0)
			return false;
		else
			return true;
	}
}