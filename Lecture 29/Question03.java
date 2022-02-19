/* 

Write a class StringIndexOf with a main method. The method receives one command line argument. Print the second occurrence of the string CA in the argument.

For Example:
Cmd Args : CALIFORNICA
9


Note: Please don't change the package name.

*/

package q11173;
public class StringIndexOf {
	public static void main(String[] args) {
		System.out.println(args[0].indexOf("CA", 2));
	}
}