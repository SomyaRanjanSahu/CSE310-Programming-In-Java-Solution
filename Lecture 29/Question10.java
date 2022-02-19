/* 

Write a class StringTrim with a main method. The method receives one command line argument, remove any leading or trailing white spaces from the argument and print the argument.

For Example:
Cmd Args :  blank
blank


Note: Please don't change the package name.

*/

package q11180;
public class StringTrim {
	public static void main(String[] args) {
		System.out.println(args[0].trim());
	}
}