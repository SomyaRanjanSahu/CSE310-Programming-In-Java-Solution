/*

Question :-

In Java programming language the code execution starts with a special method whose name is main.

This method has a fixed signature (in Java, method signature comprises of method name and the parameter types).

The main method must be marked as public, static and void. We will learn more about these in the ensuing sections.

This method also must take a String array as its argument as indicated in the below code:
public static void main(String[] args) {

}
Note that the method names in Java should always begin with lowercase.
Hence the method main is written with m in lowercase.
If the main method's signature does not match the syntax as shown above the code will not be executed even if there are no compilation errors.

See and retype the below code to familiarize your self with the main method syntax.

Note: Please don't change the package name.

Answer :-

*/

package q10755;
public class PrintHello {
	public static void main(String[] args) {
		System.out.println("Hello, I am learning Java!");
	}
}