/* 

See and retype the below code to understand the usage of instanceof operator.

Note: Please don't change the package name.

*/

package q10836;
public class InstanceOfOperatorDemo {
	public static void main(String[] args) {
		if (args instanceof String[]) {
			System.out.println("args instanceof String[] is true");
		}
		if (args instanceof Object) {
			System.out.println("args instanceof Object is true");
		}
	}
}