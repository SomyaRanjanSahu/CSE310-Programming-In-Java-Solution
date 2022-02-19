/* 

Write a class StringLastIndexOf with a main method. The method receives one command line argument. Print the index of the last but one occurrence of the string TX in the given argument.

For example:
Cmd Args : TX12TX3TX4
4
Hint: You may want to store the lastIndex of TX first into a variable. And later explore how to use the method String.lastIndexOf(String str, int fromLastIndex)

Note: Please don't change the package name.

*/

package q11175;
public class StringLastIndexOf {
	public static void main(String[] args) {
		int index = args[0].lastIndexOf("TX");
		String s = args[0].substring(0, index);
		int inx = s.lastIndexOf("TX");
		System.out.println(inx);
	}
}