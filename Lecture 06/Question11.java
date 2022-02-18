/* 

The class HolidaysCalculator is passed two string arguments.
The first argument (args[0]) contains the count of national holidays declared in that country.

The second argument (args[1]) contains the count of company specific holidays.

The below code is supposed to print the total number of holidays as the sum of both national and company holidays.

Fill in the missing code to :
convert the string passed in args[0] to short and assign to nationalHolidays
convert the string passed in args[1] to short and assign to companyHolidays
[Hint: Remember to use type-casting where required.]

Note: Please don't change the package name.

Answer :-

*/

package q10776;
public class HolidaysCalculator {
	public static void main(String[] args) {
		short nationalHolidays = Short.parseShort(args[0]);
		short companyHolidays = Short.parseShort(args[1]);
		short totalHolidays = (short)(nationalHolidays + companyHolidays);
		System.out.println("totalHolidays = " + totalHolidays);
	}
}