/* 

Question :-

The Java programs can be passed arguments on the command line while executing. These arguments are made available in a String array, which is passed into the main method.

Click on  to understand how the arguments passed on command line are available to the main method.

See and retype the below code. The class CommandLineArgumentsDemo is passed 4 arguments during execution.

Note: Please don't change the package name.

Answer :-

*/

package q10792;
public class CommandLineArgumentsDemo {
	public static void main(String[] args) {
		System.out.println("args.length : " + args.length);
		System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);
		System.out.println("args[2] : " + args[2]);
		System.out.println("args[3] : " + args[3]);
	}
}