/* 

Write a class CountOfTwoNumbers with a public method compareCountOf that takes three parameters one is arr of type int[] and other two are arg1 and arg2 are of type int and returns true if count of arg1 is greater than arg2 in arr. The return type of compareCountOf should be boolean.

Assummptions:
arr is never null
arg1 and arg2 may be same
Here are an example:
Enter no of elements in the array:
6
Enter elements in the array seperated by space:
1 2 2 3 5 2
Enter the arg1 element:
2
Enter the arg2 element:
5
true
Enter no of elements in the array:
4
Enter elements in the array seperated by space:
99 -10 99 -1
Enter the arg1 element:
99
Enter the arg2 element:
99
false


Note: Please don't change the package name.

*/

package q11075;

public class CountOfTwoNumbers {
	/**
	 * Find the count of arg1 is more than arg2 in the arr or not 
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean compareCountOf(int[] arr, int arg1, int arg2) {
		//write your code here
		int c1=1;
		int c2=1;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==arg1){
				c1++;
			}
			if(arr[i]==arg2){
				c2++;
			}
		}
		if(c1>c2){
			return true;
		}
		return false;
	}
}