/* 

Write a class StringCompare with a main method. The method receives two command line arguments and prints true if both are equal.

Assumptions:
Ignoring the case of the two arguments
For Example:
Cmd Args : Congrats conGrats
true


Note: Please don't change the package name.

*/

package q11166;
public class StringCompare {
	public static void main(String[] args) {
		System.out.println(args[0].equalsIgnoreCase(args[1]));
	}
}