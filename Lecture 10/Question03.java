/* 

See and retype the below code to understand how comparison and relational operators are used.

Note: Please don't change the package name.

Ans :-

*/

package q10831;
public class RelationalOperatorDemo {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		if (x != y) {
			System.out.println("x != y : " + (x != y));
		}
		if (x < y) {
			System.out.println("x < y : " + (x < y));
		}
		x++;// incrementing x
		if (x == y) {
			System.out.println("x == y : " + (x == y));
		}
		--y;// decrementing y
		if (x > y) {
			System.out.println("x > y : " + (x > y));
		}
	}
}