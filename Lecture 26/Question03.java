/* 

Write a Java program with a class name Staff, contains the data members id (int), name (String) which are initialized with a parameterized constructor and the method show().

The member function show() is used to display the given staff data.

Write the main() method with in the class which will receive two arguments as id and name.

Create an object to the class Staff with arguments id and name within the main(), and finally call the method show() to print the output.

If the input is given as command line arguments to the main() as "18", "Gayatri" then the program should print the output as:
Id : 18
Name : Gayatri


Note: Please don't change the package name.

*/

package q11116;
public class Staff{
	int id;
	String name;
	
	public void show(int id, String name) {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
	
	public static void main(String[] args) {
		int id = Integer.parseInt(args[0]);
		Staff obj = new Staff();
		obj.show(id,args[1]);
	}
}