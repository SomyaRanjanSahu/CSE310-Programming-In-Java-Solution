/* 

Write a class PrefixCheck with a main method. The method receives one command line argument. If the argument starts with en print it as it is, else prepend en and print the output.

These are examples for your understanding :
Cmd Args : bye
enbye
Cmd Args : entertainment
entertainment


Note: Please don't change the package name.

*/

package q11192;
public class PrefixCheck {
	public static void main(String[] args) {
		if(args[0].startsWith("en"))
			System.out.println(args[0]);
		else
			System.out.println("en" + args[0]);
	}
}