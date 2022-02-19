/* 

Write a class CountChars with a main method. The method receives one command line argument and prints the number of o's (it is not zero, it is the alphabet 'o') present in the argument.

Example:
Cmd Args : ozone
2
Note: Make sure to use println and not print method.

Note: Please don't change the package name.

*/

package q11214;
public class CountChars {
	public static void main(String args[]) {
		
		String s = args[0];
		
		Character ele = 'o';
		long count = s.chars().filter(ch -> ch == ele).count();
		System.out.println(count);
	}
}