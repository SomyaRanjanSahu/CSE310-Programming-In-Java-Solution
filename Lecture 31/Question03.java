/* 

Write a class ExpandAString with a main method. The program receives two command line arguments. The first argument is a string and the second argument is a number. Print the first argument as many number of times as the second argument.

For Example:
Cmd Args : Ganga 3
GangaGangaGanga
Note: Make sure to use println and not print method.

Note: Please don't change the package name.

*/

package q11193;
public class ExpandAString {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[1]);
		String s = "";
		while(n > 0) {
			s = s + args[0];
			n--;
		}
		System.out.println(s.trim());
	}
}