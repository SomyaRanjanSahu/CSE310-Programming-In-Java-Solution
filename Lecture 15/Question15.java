/* 

Create a class FindMax with a public method findMax that takes three parameters arg1, arg2, and arg3 are of type int. The program should print the largest of the given numbers.

For example:
Cmd Args : 10 20 5
20
Note: Please don't change the package name.

*/

package q10930;
public class FindMax {
	public void findMax(int arg1 , int arg2 , int arg3) {
		if (arg1 > arg2 && arg1 > arg3){
			System.out.println(arg1);
		} else if (arg2 > arg3) {
			System.out.println(arg2);
		} else {
			System.out.println(arg3);
		}
	}
}