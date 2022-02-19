/* 

Write a class SequenceCheck with a public method sequenceCheck that takes one parameter arr of type int[] and returns true if 6, 9, 12 present consecutively in the arr. The return type of sequenceCheck should be boolean.

Assumptions:
arr is never null
Elements 6, 9, 12 are appear consecutiviely
Here are examples:
Cmd Args : 62 32 6 9 12
true
Cmd Args : 99 36 6 12 56 9
false


Note: Please don't change the package name.

*/

package q11059;

public class SequenceCheck {
	/**
	 * Find the given elements present consecutively in the array or not
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean sequenceCheck(int[] arr) {
		
		//Write your code here
		int flag = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == 6 && arr[i+1] == 9 && arr[i+2] == 12) {
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			return true;
		else
			return false;
	}
}