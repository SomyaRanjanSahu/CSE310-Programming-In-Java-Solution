/* 

The below statement declares two short variables x and y initialized to 3 and 4 respectively.
short x = 3, y = 4;
However, when we try to perform an addition operation, such as given below, we get a compilation error : Type mismatch: cannot convert from int to short.
short sum = x + y;
In Java, when a binary operator (like, *, / ,%, +, etc. ) is being used, if at least one operand is of type double, float or long then the operation is carried out by automatically widening the other operand also to that former's type (if it is not already of the former's type) and the result is also of the former's type.
And for all other numeric types (like byte, short, char) the operands are automatically widened to int and the result is also an int.

Since x and y are of type short, they both are automatically widened to int, and the resultant int is being assigned to sum which is of type short.
The compile-time error occurs while assigning the result which happens to be an int. To fix it, we will have to explicitly type cast the result to a short, as shown below.
short sum = (short)(x + y);
Applying the above understanding identify and correct the error so that the correct output is produced.

Note: Please don't change the package name.

Answer :-

*/

package q10774;
public class ShortDemo {
	public static void main(String[] args) {
		short mangos = 3;
		short bananas = 4;
		short fruits = (short)(mangos + bananas);
		System.out.println("fruits = " + fruits);// should print 7
	}
}