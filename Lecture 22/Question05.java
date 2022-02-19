/* 

Write a class ReorderArray with a public method reorder that takes one parameter arr of type int[] and returns the arr such that all even numbers in the array come to the front of the arr.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
3 5 6 4 2 4
6
4
2
4
3
5


Note: Please don't change the package name.

*/

package q11090;

public class ReorderArray {
	/**
	 *Arrange all even numbers to infront of the array 
	 * 
	 * 
	 * 
	 * 
	 * @return result
	 */
	 
	public int[] reorder(int[] arr) {
		
		//Write your code here
		int[] a = new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0){
				a[j]=arr[i];
				j++;
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 != 0){
				a[j] = arr[i];
				j++;
			}
		}
		return a;
	}
}