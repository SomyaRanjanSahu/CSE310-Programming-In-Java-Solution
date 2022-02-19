/* 

Write a class EndsWith with a main method. The method receives one command line argument. Print true if the argument ends with bad, else print false.

For Example:
Cmd Args : Hyderabad
true
Note: Make sure to use println and not print method.

Note: Please don't change the package name.

*/

package q11204;
public class EndsWith {
	public static void main(String args[]) {
		
		String s = args[0];
		
		if(s.endsWith("bad"))
			System.out.println("true");
		else
			System.out.println("false");
	}
}