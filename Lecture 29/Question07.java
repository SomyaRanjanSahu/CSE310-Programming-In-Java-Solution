/* 

Write a class SubstringText with a main method. The method receives one command line argument. Print a substring of the argument that starts from index 7.

For Example:
Cmd Args : Synchronicity
nicity
Note: Assume that the first argument will always contain more than 7 characters.

Note: Please don't change the package name.

*/

package q11177;
public class SubstringText {
	public static void main(String[] args) {
		System.out.println(args[0].substring(7));
	}
}