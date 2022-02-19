/* 

Write a class FindMiddle with a public method findMiddle that takes one parameter arr of type int[] and print the middle element in the arr

Assumptions:
arr is never null
arr length is even it should print the middle two numbers
arr length is odd it prints the middle element
Here are examples for your understanding:
Cmd Args : 1 6 3 5 4
3
Cmd Args : 3 2 1 6 5 4
1
6


Note: Please don't change the package name.

*/

package q11061;

public class FindMiddle {
	/**
	 * Find the middle element in the given array
	 * 
	 * 
	 * 
	 * @ return element
	 */ 
	public void findMiddle(int[] arr) {
		
		//Write your code here
		if(arr.length%2 == 0) {
			System.out.println(arr[arr.length/2-1]);
			System.out.println(arr[arr.length/2]);
		}
		else
			System.out.println(arr[arr.length/2]);
	}
}