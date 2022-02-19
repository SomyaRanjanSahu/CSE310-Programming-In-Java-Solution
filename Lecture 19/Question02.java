/* 

Create a class MountainNamePrinter with a main method. Create an array with the following names: Nanda Devi, Kamet, K12, Dunagiri.

Iterate over the array and print each name on a separate line.

Note: Please don't change the package name.

*/

package q10937;
public class MountainNamePrinter {
	public static void main(String[] args) {
		String[] name = {"Nanda Devi", "Kamet", "K12", "Dunagiri"};
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}