/* 

Write a class ElementDiff with a public method findDiff that takes one parameter arr of type int[] and returns the difference between largest and smallest elements in the arr.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the arr:
5
Enter elements in the arr seperated by space:
33 78 95 14 45
Difference between largest and smallest elements in the array is: 81


Note: Please don't change the package name.

*/

package q11071;

public class ElementDiff {
	/**
	 * Compute the difference between large and small elements in the given arry
	 * 
	 * 
	 * @return result
	 */ 
	
	public int findDiff(int[] arr) {
		
		//Write your code here
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				max= arr[i];
			}
		}
		int d =max - min;
		return d;
	}
}