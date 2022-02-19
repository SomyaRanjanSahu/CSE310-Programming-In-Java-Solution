/* 

Write a class NumberPalindrome with a public method isNumberPalindrome that takes one parameter number of type int. Write a code to check whether the given number is palindrome or not.

For example
Cmd Args : 333
333 is a palindrome


Note: Please don't change the package name.

*/

package q10894;

public class NumberPalindrome {
	
	public void isNumberPalindrome(int number) {
		
		//Write your code here
		int rem , rev = 0, temp;
		temp = number;
		while(number!=0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
		if (rev == temp) {
			System.out.println(temp + " is a palindrome");
		} else {
			System.out.println(temp + " is not a palindrome");
		}
	}
}