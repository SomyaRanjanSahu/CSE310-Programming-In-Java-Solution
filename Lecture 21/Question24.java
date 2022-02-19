/* 

Write a class FindAverage with a public method findAverage that takes one paremeter arr of type int[] and returns the average of elements in the arr.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the arr:
4
Enter elements in the arr seperated by space:
1 2 3 4
Avg elements of the array is:
2


Note: Please don't change the package name.

*/

package q11072;

public class FindAverage {
	/**
	 * Compute the average of elements in the given array
	 * 
	 * 
	 * @return result
	 */ 
	
	public int findAverage(int[] arr) {
		
		//Write your code here
		int sum =0;
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		int avg = sum / arr.length;
		return avg;
	}
}