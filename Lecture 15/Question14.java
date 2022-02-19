/* 

Create a class CountSeniorCitizens with a public method countSeniorCitizens that takes four parameters age1, age2, age3, and age4 are of type int. The program should print the count of numbers which are greater than 60.

For Example:
Cmd Args : 60 61 59 58
1
[Hint: You can use multiple if conditions to keep track of the count.]

Note: Make sure to use println and not print method.

Note: Please don't change the package name.

*/

package q10929;
public class CountSeniorCitizens {
	public void countSeniorCitizens(int age1 , int age2 , int age3 , int age4) {
		int count = 0;
		if (age1 > 60) {
			++count;
		}
		if (age2 > 60) {
			++count;
		}
		if (age3 > 60) {
			++count;
		}
		if (age4 > 60) {
			++count;
		}
		System.out.println(count);
	}
}