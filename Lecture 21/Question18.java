/* 

Write a class CompareArrays with a public method compareArrays that takes two parameters arr1 and arr2 are of type int[] and returns true if the lengths of arr1 and arr2 are equal.

Here is an example:
Enter lenght of the arr1:
5
Enter lenght of the arr2:
5
true


Note: Please don't change the package name.

*/

package q11066;

public class CompareArrays {
	/**
	 * Find the length of the two arrays are equal or not
	 * 
	 * 
	 * @return result
	 */ 
	
	
	
	public boolean compareArrays(int[] arr1, int[] arr2) {
		//Write your code here
		if(arr1.length == arr2.length) {
			return true;
		} else {
			return false;
		}
	}
}