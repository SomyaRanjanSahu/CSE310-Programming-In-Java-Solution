/* 

Write a class PrimeNumbers with a public method primeInLimits that takes two parameters high and low are of type int. Print the prime numbers between the given limits (including first and last values)

For example:
Cmd Args : 3 10
3 5 7 
Note: Please don't change the package name.

*/

package q10892;

public class PrimeNumbers {
	
	public void primeInLimits(int low, int high) {
		int i, count;
		
		//Write your code here
		while(low <= high) {
			count = 0;
			i = 2;
			while(i <= low/2) {
				if ( low %i == 0) {
					count++;
					break;
				}
				i++;
			}
			if(count == 0 && low != 1 ) {
				System.out.print(low + " ");
			}
			low++;
		}
		
	}
}
