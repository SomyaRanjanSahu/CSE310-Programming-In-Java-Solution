/* 

Write a class StringCompare with a main method. The method receives one command line argument. Print true if the argument ends with the suffix ed, else print false.

For Example:
Cmd Args : prefixed
true


Note: Please don't change the package name.

*/

package q11168;
public class StringCompare {
	public static void main(String[] args) {
		System.out.println(args[0].endsWith("ed"));
	}
}