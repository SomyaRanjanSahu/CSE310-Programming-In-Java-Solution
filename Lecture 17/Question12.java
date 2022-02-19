/* 

Write a class SumAndReverseNumber with a method sumAndReverseANumber that takes one parameter number of type int and find the sum of digits of a given number also find the reverse of a number and print the result.

For example, if a value of 369 is passed then the output should be:
Sum of digits : 18
Reverse : 963


Note: Please don't change the package name.

*/

package q10893;
public class SumAndReverseNumber {
	public void sumAndReverseANumber(int number) {
		int sum = 0 , rem, temp = 0;
		while(number!=0) {
			rem = number % 10;
			sum = sum + rem;
			temp = temp * 10 + rem;
			number = number / 10;
		}
		System.out.println("Sum of digits : " + sum);
		System.out.println("Reverse : " + temp);
	}
}