/* 

Write a class StringIndexOf with a main method. The method receives one command line argument. Print the index of the first occurrences of the string CA in the argument.

For Example:
Cmd Args : TCA*CX*CX*CAT
1


Note: Please don't change the package name.

*/

package q11172;
public class StringIndexOf {
	public static void main(String[] args) {
		System.out.println(args[0].indexOf("CA"));
	}
}