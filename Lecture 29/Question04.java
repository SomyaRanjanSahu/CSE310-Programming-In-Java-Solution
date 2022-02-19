/* 

Write a class StringLastIndexOf with a main method. The method receives one command line argument. Print the index of the last occurrence of the character * in the argument.

For Example:
Cmd Args : TCA*TX*TX*
9


Note: Please don't change the package name.

*/

package q11174;
public class StringLastIndexOf {
	public static void main(String[] args) {
		System.out.println(args[0].lastIndexOf("*"));
	}
}