/* 

Write a class ElementCheck with a public method checkElement that takes three parameters one is arr of type int[] other are arg1 and arg2 are of type int and returns true if arr contains either arg1 or arg2 elements only.

These are examples for your understanding:
Enter no of elements in the array:
4
Enter elements in the array separated by space:
22 33 22 33
Enter arg1 element:
22
Enter arg2 element:
33
true
Enter no of elements in the array:
5
Enter elements in the array separated by space:
11 22 11 22 11
Enter arg1 element:
11
Enter arg2 element:
12
false


Note: Please don't change the package name.

*/

package q11068;
public class ElementCheck {
	/**
	 * Find if the arr contains only arg1 or arg2 elements
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkElement(int[] arr, int arg1, int arg2) {
		
		//Write your code here
		boolean t = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==arg1) {
				t = true;
			}
			else if(arr[i]==arg2){
				t = true;
			}
			else {
				return false;
			}
		}
		return t;
	}
}