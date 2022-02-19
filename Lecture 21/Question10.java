/* 

Write a class SwapFirstAndLast with a public method swap that takes one parameter arr of type int[]. Write a code to swap the first and last elements of the array and print all the elements of the array.

For example:
Cmd Args : 1 5 6 7 8
8
5
6
7
1


Note: Please don't change the package name.

*/

package q11058;
public class SwapFirstAndLast {
	public void swap(int[] arr) {
		int temp;
		temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}