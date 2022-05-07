/* 

Few key points to lambda expressions:

Lambda expressions basically express instances of functional interfaces. 
lambda expressions implement the only abstract function and therefore implement functional interfaces.
Lambda expressions can only be used to implement functional interfaces.


Note: lambda expressions are added in Java 8 and provide below functionalities.

Enable to treat functionality as a method argument that is code as data
A function that can be created without belonging to any class.
A lambda expression can be passed as an object and executed on demand.






Type below given code in the editor to run and understand the concept of the use of lambda expressions to implement a user defined functional interface.

import java.util.*;
import java.lang.*;
import java.io.*;

//Use of lambda expressions to implement a user defined//functional interface.//Interface with single abstract method
interface FuncInterface{
	void AbstractFunction(int A);
	// Default non abstract function
	default void GeneralFunction(){
		System.out.println("Welcome");
		
	}
	
}

class LambdaExpression{
	public static void main(String args[]){
		// Functional interface using lambda expression
	   FuncInterface fobj = (int A)->System.out.println(10+A);
		// Calls to lambda expression
	  fobj.AbstractFunction(15);
		
	}
	
}
Sample Test Cases
Test Case 1:
Expected Output:
25

*/

import java.util.*;
import java.lang.*;
import java.io.*;

interface FuncInterface {
	    void AbstractFunction(int A);
	    
	        default void GeneralFunction() {
	        	        System.out.println("Welcome");
	        	        
	        }
	        
}

class LambdaExpression {
	    public static void main(String args[]) {
	    	
	    	        FuncInterface fobj = (int A) -> System.out.println(10 + A);
	    	        
	    	                fobj.AbstractFunction(15);
	    	                
	    }
	    
}