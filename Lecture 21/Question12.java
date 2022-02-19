/* 

Write a class SequenceCheck with a public method sequenceCheck that takes one parameter arr of type int[] and returns true if the elements 1,2,3 are present in the arr.The returen type of sequenceCheck should be boolean.

Assumptions:
arr is never null
The elements need not be in consecutive order
Here are examples:
Cmd Args : 1 6 3 2
true
Cmd Args : 3 6 4 7 8
false

*/

package q11060;

public class SequenceCheck {
	/**
	 * check if the given array contains the elements 1,2,3 
	 * 
	 * 
	 * 
	 * @return true if contain else return false
	 */
	
	
	
	
	public boolean sequenceCheck(int[] arr) {
		
		//Write your code here
		int count =0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1)
				count++;
			if(arr[i] == 2)
				count++;
			if(arr[i] == 3)
				count++;
		}
		if(count >= 3)
			return true;
		else
			return false;
	}
}