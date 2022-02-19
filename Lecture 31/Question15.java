/* 

Write a class EndsWith with a main method. The method receives two command line arguments. Print true if the first argument ends with the second argument (ignoring case), else print false.

Example:
Cmd Args : Godavari ri
true
[Hint: Since we have to verify ignoring the case, you may want to first convert both either to lower or upper case before comparing.]

Note: Please don't change the package name.

*/

package q11205;
public class EndsWith {
	public static void main(String[] args) {
		
		String s = args[0].toLowerCase();
		
		if(s.endsWith(args[1].toLowerCase()))
			System.out.println("true");
		else
			System.out.println("false");
	}
}