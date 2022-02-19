/* 

Write a class ElementCheck with a public method checkFirstOrLast that takes two parameters arr1 and arr2 are of type int[] and returns true if first or last elements of arr1 and arr2 are same. The return type of checkFirstOrLast should be boolean.

Assumptions:

arr1 and arr2 will never null
arr1 and arr2 lengths are not equal


Here is an example:
Enter no of elements in the array1:
5
Enter elements in the array1 seperated by space:
3 6 8 7 4
Enter no of elements in the array2:
3
Enter elements in the array2 seperated by space:
6 5 4
true


Note: Please don't change the package name.
Sample Test Cases
Test Case 1:
Expected Output:
Enter·no·of·elements·in·the·array1:
4
Enter·elements·in·the·array1·seperated·by·space:
6 3 2 1
Enter·no·of·elements·in·the·array2:
4
Enter·elements·in·the·array2·seperated·by·space:
3 2 1 5
false

Test Case 2:
Expected Output:
Enter·no·of·elements·in·the·array1:
5
Enter·elements·in·the·array1·seperated·by·space:
3 6 8 7 4
Enter·no·of·elements·in·the·array2:
3
Enter·elements·in·the·array2·seperated·by·space:
6 5 4
true

*/

package q11050;
public class ElementCheck {
	/**
	 * check if first or last elements of the arr1 and arr2 are same or not
	 * 
	 * 
	 * @return result
	 */
	 
	public boolean checkFirstOrLast(int[] arr1, int[] arr2) {
		//Write your code here
		if(arr1[0] == arr2[0])
			return true;
		else if(arr1[arr1.length-1] == arr2[arr2.length-1])
			return true;
		else
			return false;
	}
}