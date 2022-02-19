/* 

Write a class ReversePrint with a public method reversePrint that takes one parameter arr of type int[] and returns the elements of arr in reverse order. The return type of ReversePrint should be int.

Assumptions:
arr is never null
Here is an example:
Cmd Args : 32 56 85 1
Array in reverse order is : 
1
85
56
32


Note: Please don't change the package name.

*/

package q11047;
public class ReversePrint {
	/**
	 * write a logic to find the array of elements in reverse order.
	 * 
	 * 
	 * @return the reverseArray 
	 */
	 
	 public int[] reversePrint(int[] arr) {
	 	//Wrtie code here
	 	int t;
	 	int n =arr.length;
	 	for(int i=0; i<n/2; i++) {
	 		t = arr[i];
	 		arr[i] = arr[n-i-1];
	 		arr[n-i-1] = t;
	 	}
	 	return arr;
	 }
}