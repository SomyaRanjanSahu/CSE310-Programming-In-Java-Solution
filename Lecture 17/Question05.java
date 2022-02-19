/* 

Write a class PrimeVerify with a public method checkPrimeOrNot that takes one parameter number of type int. Write a code to check whether the given number is a prime number or not.

For example:
Cmd Args : 13
13 is a prime number


Note: Please don't change the package name.

*/

package q10885;
public class PrimeVerify {
	public void checkPrimeOrNot(int number) {
		int flag = 0;
		for (int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag =1;
			}
		}
		if (flag == 0) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
}