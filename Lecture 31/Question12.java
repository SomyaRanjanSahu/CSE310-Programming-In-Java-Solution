/* 

Write a class ReverseString with a main method. The method receives one command line argument. Write a logic to reverse it and print the output.

For Example:
Cmd Args : Ram lakshman
namhskal maR


Note: Please don't change the package name.

*/

package q11202;
public class ReverseString {
	public static void main(String[] args) {
		String str = args[0];
		String res = "";
		for(int i=str.length()-1; i>=0; i--) {
			res += str.charAt(i);
		}
		System.out.println(res.trim());
	}
}