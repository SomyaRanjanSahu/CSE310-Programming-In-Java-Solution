
// Question :-

// In Java, there are three types of comments:
// end-of-line comment : It starts with // and the content following // till the end of that line is a comment. It is also called as the single-line comment.
// traditional comment : It starts with /* and ends with */, the content between /* and */ is the comment. It is also called as multi-line comment.
// Java Doc comment : It starts with /** and ends with */, the content between /** and */ contains the java documentation information. Click here for more information on Java Doc comment.
// Below code example shows all the three types of comments. 

// /**
//  * This class has an example code for addition operator
//  * @author James Gosling
//  */
// public class TestAddition {
	
// 	public int sum(int num1, int sum2) {
// 		/* This is an example for traditional comment
// 		   also called as star-comment or multi-line comment
// 		*/
// 		return num1 + num2;
// 	}//end of the method sum
	
// }//end of the classNote the extra space marked as a pink block  . Also note that the class declaration statement public class TestAddition { should not have space before it.

// See and re-type the below code to understand the different types of comments.

// Below are 3 important points regarding comments:
// There should not be a space between // in case of end-of-line comment and in between /*, /** and */ in case of the standard and Java Doc comments.
// Comments do not nest. Meaning /* and */ comment has no special meaning inside a // comment and similarly, a // comment has no special meaning inside a /** or a /* comment.
// One should not write comments inside character literals. Comments inside String literals are part of the String's content.


// Note: Please don't change the package name.

// Answer :-


package q10799;
/**
 * This is a sample Java Doc comment
 * @author James
 */
public class TestComments {
	public static void main(String[] args) {
		/* this is an example for standard comment which can span across multiple lines */
		// this is an end of line comment
		System.out.println("This is a simple example on java comment lines");
	}
}