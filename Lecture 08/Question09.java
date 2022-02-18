/* 

Write a java program to display the default values of all primitive data types.

Write a class PrimitiveTypes with main(String[ ] args) method.

Write code to produce the below output:
byte default value = 0
short default value = 0
int default value = 0
long default value = 0
boolean default value = false
double default value = 0.0
float default value = 0.0


Note: Please don't change the package name.

Ans :-

*/

package q10815;
public class PrimitiveTypes {
	public static void main(String[] args) {
		System.out.println("byte default value = " + Byte.parseByte("0"));
		System.out.println("short default value = " + Short.parseShort("0"));
		System.out.println("int default value = " + Integer.parseInt("0"));
		System.out.println("long default value = " + Long.parseLong("0"));
		System.out.println("boolean default value = " + Boolean.parseBoolean("false"));
		System.out.println("double default value = " + Double.parseDouble("0.0"));
		System.out.println("float default value = " + Float.parseFloat("0.0"));
	}
}