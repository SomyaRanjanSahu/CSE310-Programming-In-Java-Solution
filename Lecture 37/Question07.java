/* 

valueOf():

The valueOf() method can be used to obtain an instance of the enum class for a given String value. Here is an example.
enum Subject{
JAVA, C, PYTHON
}
Iteration can be done for the above enum class using the method value() can be done by
Subject sub = Subject.valueOf("JAVA");
}
Write the missing code in the below program.

Ans :-

*/

package q24200;
public class Test {
	public static void main(String args[]) {
		
		// print the instances of all enumeration constants in enum class Languages
		Languages a = Languages.valueOf("JAVA");
		Languages b = Languages.valueOf("PYTHON");
		Languages c = Languages.valueOf("C");
		Languages d = Languages.valueOf("CPP");
		Languages e = Languages.valueOf("DBMS");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
}
enum Languages {
	JAVA,
	PYTHON,
	C,
	CPP,
	DBMS
}