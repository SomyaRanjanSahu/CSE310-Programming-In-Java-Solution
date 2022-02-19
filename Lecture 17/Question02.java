/* 

Write a class APowerN with a public method powerOf that takes two parameters A and N are of type int. Complete the missing code in the below program such that it should print the value of aPowerN.

Assumptions:
A and N are two positive and non-zero numbers
For example:
Cmd Args : 2 8
APowerN = 256
Hint: You can use a for loop to multiply A with itself N number of times.

Variable aPowerN can be used to store the computed value of AN inside the for loop.

Note: Please don't change the package name.

*/

package q10882;
public class APowerN {
	public void powerOf(int A, int N) {
		int aPowerN = 1;
		// Fill in the missing code using the for loop calculate A to the power N 
		for (int i=1; i<=N; i++) {
			aPowerN = aPowerN*A;
		}
		System.out.println("APowerN = " + aPowerN);
	}
}