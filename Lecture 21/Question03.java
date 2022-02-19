/* 

Write a class ElementCheck with a public method checkFirstOrLast that takes two parameters one is arr of type int[] and second one is arg of type int and returns true if the arg is first or last element in the arr else returns false. The return type of checkFirstOrLast is boolean.

Assumption:
arr is never null
Here is an example:
Enter no of elements in the array: 4
Enter elements in the array seperated by space:1 2 3 6
Enter the search element:6
true


Note: Please don't change the package name.

*/

package q11048;

public class ElementCheck {

/** write a logic to check whether the given element is present in the first or last in the array 
 * 
 * 
 * 
 *@return true if the element present if not return false
 * 
 */
 	public boolean checkFirstOrLast(int[] arr, int arg) {
		//Write your code
		if(arr[0] == arg ||  arr[arr.length-1] == arg)
			return true;
		else
			return false;
	}
}