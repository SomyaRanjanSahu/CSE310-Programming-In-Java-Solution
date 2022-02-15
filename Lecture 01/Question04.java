/* 

Question :-

A Java program consists of one or more classes. A class is the top most building block which is given a name, we will learn more about it later.

A class usually consists of data (i.e encapsulates data) and methods which operate on that data.

Among the various classes, the class from where the execution starts contains a special method called main().

Below is the general structure followed while writing a Java class (i.e a source file with .java extension):
License statement in comments detailing ownership
Package statement
Import statements
Documentation comment
Class or Interface definition
Click on the below Live Demo button to learn the structure of Java program.



Though we will deal with the above sections in greater details later, below you will find brief notes on the same.

The License statement usually contains details about the copyright and other ownership information.

Java allows user to group classes into a folders called packages. A package statement includes a statement that provides a package declaration.

The Package statement details the underlying folder structure into which the current class file (source code) is stored. This informs the compiler that the class defined in the current file belong to this package. This statement is optional, though it is always used in large projects.

The format of defining a new package is:
package com.orgName.projName; // package is a keyword and com.orgName.projName is the package name // which reflects the nested folders with names com, orgName and projName // as given by the user.Java contains many predefined classes (which allow us to work with Files, Dates, etc.) that are stored into packages. In order to refer these standard predefined classes in our program, we can either use their fully qualified class name (meaning class name prefixed with package name) or use the import keyword.

The import statement informs the compiler to use the classes or packages while trying to compile the existing class file. This is also optional, but when used should always be written before defining a class after the package statement.

The format of importing packages is:
import packageName;
For example:
import java.io.*; // imports all the classes that are defined in java.io package
import java.io.File; // which would import only the File class present in java.io package 
import java.util.Date; // imports only the Date class in java.util packageThe Documentation comment section consists of a set of comment lines detailing the purpose and functionality of this class along with the name of the class, the author and other details. We will learn more about it in the next section.

The class or interface definition forms the main body of a java source code. Interfaces are like classes which contain method declarations (signatures) without definitions (the actual body of the method). We will learn more about them later.

The keyword class is used to declare a class and the keyword interface is used to declare an interface. These classes and interfaces declared act as templates (blueprints that model real world entities).

The main() method is optional in a class, but when present acts as the starting point of execution in that class. It instantiates objects of various classes and establishes the communication between them. The program terminates on reaching the end of the main() method.

See and retype the below code.

Note: Please don't change the package name.

Answer :-

*/

package q10734;
// A sample program
public class FirstJavaProgram {
	public static void main(String[] args) {
		System.out.println("India got its independence in 1947");
	}
}