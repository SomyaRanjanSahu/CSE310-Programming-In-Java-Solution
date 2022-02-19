/* 

Write a class ReorderArray with a public method reorder that takes one parameter arr of type int[] and returns the arr such that all zeros should come in front of the arr.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the arr:
8
Enter elements in the arr seperated by space:
55 0 21 0 63 0 45 0
0
0
0
55
21
63
45


Note: Please don't change the package name.

*/

package q11089;

public class ReorderArray {
	/**
	 *Arrange all the zeros should come infront of the array
	 * 
	 * 
	 * 
	 *@return array
	 * 
	 */
	 
	public int[] reorder(int[] arr) {
		//Write your code here
		int[] a = new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				a[j] = 0;
				j++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				a[j]=arr[i];
				j++;
			}
		}
		return a;
	}
}