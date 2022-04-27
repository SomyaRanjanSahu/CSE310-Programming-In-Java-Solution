/*

lambda expressions to implement a user defined functional interface:



Implementation with documentation:



import java.util.*;
import java.lang.*;
import java.io.*;
// lambda expressions to implement a user defined functional interface.//@FunctionalInterface you can use here just to tell compiler that only one abstract interface is defined// except this annotation also code works in similar way
interface Cube{
int Compute(int X);
}

class UserdefinedFunctionalInterface{
	 public static void main(String args[]){
		 Scanner S = new Scanner(System.in);
		 System.out.print("Enter any number: ");
		 int A = scan.nextInt();
// lambda expression definition for Compute method
 		 Cube C = (int X)->X*X*X;

 // Passing and returning parameters must be exactly  // same as defined in the prototype
		 int Result = C.Compute(A);
 		System.out.println("Cube of value is “+Result);
	}
}


Sample test case:
Input:
Enter any number: 16
Output:
Cube of value is 4096


Type the code given above or given in the editor and execute to check the functionality.

Sample Test Cases
Test Case 1:
Expected Output:
Enter·any·number:·16
Cube·of·value·is·4096

Test Case 2:
Expected Output:
Enter·any·number:·5
Cube·of·value·is·125

*/

	// Type the code as provided in UserdefinedFunctionalInterface.java 
   	// here to well versed with the Concept
   	import java.util.*;import java.lang.*;
   	import java.io.*;
   	interface Cube {   
   		int Compute(int X);}class UserdefinedFunctionalInterface {  
   			public static void main(String args[]) {      
   				Scanner sc = new Scanner(System.in);     
   				System.out.print("Enter any number: ");     
   				int A = sc.nextInt();      
   				Cube C = (int X) -> X * X * X;        
   				System.out.println("Cube of value is " + C.Compute(A)); 
   			}
   		}