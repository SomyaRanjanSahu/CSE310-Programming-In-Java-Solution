/* 

Write a Java program with a class name Employee which contains the data members name (String), age (int), designation (String), salary (double) and the methods setData(), displayData().

The member function setData() is used to initialize the data members and displayData() is used to display the given employee data.

Write the main() method with in the class which will receive four arguments as name, age, designationand salary.

Create an object to the class Employee within the main(), call setData() with arguments and finally call the method displayData() to print the output.

If the input is given as command line arguments to the main() as "Saraswathi", "27", "Teacher", "37250" then the program should print the output as:
Name : Saraswathi
Age : 27
Designation : Teacher
Salary : 37250.0


Note: Please don't change the package name.

*/

package q11115;
public class Employee {
	
	String name, designation;
	int age;
	double salary;
	
	public void setData(String name, int age, String designation, double salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void displayData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Designation : " + designation);
		System.out.println("Salary : " + salary);
	}
	
	public static void main(String[] args) {
		int age = Integer.parseInt(args[1]);
		double salary = Double.parseDouble(args[3]);
		Employee obj = new Employee();
		obj.setData(args[0],age,args[2],salary);
		obj.displayData();
	}
}