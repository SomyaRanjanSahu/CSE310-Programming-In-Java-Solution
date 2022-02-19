/* 

Write a class StringCompare witha a main method. The method receives one command line argument. Print true if the argument starts with the prefix pre, otherwise print false.

For Example:
Cmd Args : preparation
true


Note: Please don't change the package name.

*/

package q11167;
public class StringCompare {
	public static void main(String[] args) {
		System.out.println(args[0].startsWith("pre"));
	}
}