/* 

Question :-

The below code demonstrates how command line arguments are passed to a class called CommandLineArgumentDemo

>> javaCommandLineArgumentDemoRedBlueGreenIn the above code :
the first argument Red can be accessed as args[0]
the second argument Blue can be accessed as args[1]
the third argument Green can be accessed as args[2]
Click on  to understand how the arguments passed on command line are available to the main method.

In the above example, if we want to print the first argument the code will be as given below:
System.out.println(args[0]);
Similarly, if we want to print the third argument the code will be as given below:
System.out.println(args[2]);
Note that the index values passed in args[index] always start with 0 (zero) for first argument, 1 for second argument and so on.

Assume that three command line arguments will be passed to the below class with name CommandLineArgumentDemo.
Write code in the main(String[] args) method to print only the second argument.

Note: Please don't change the package name.

Answer :-

*/

package q10793;
public class CommandLineArgumentDemo {
	public static void main(String[] args) {
		//Write the code fragment in the below println(     ) method to print only the second argument
		System.out.println(args[1]);
	}
}