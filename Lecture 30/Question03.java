/* 

See and retype the code below.

Note: Please don't change the package name.

*/

package q11187;
public class StringFormatting {
	public static void main(String[] args) {
		float dVar = 3.141f;
		
		System.out.printf("%f%n", dVar);
		System.out.printf("%.3f%n", dVar);
		System.out.printf("%.2f%n", dVar);
		System.out.printf("%08.4f%n", dVar);
		System.out.printf("%+08.4f%n", dVar);
	}
}