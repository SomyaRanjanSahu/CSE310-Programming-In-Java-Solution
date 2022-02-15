/* 

Question :-

Spaces and Tabs are very important for code formatting.

An empty space is used as a separator between two tokens. A tab ———  is used only to indent lines.

Whenever a new block of code starts after the opening brace { the lines inside that block should be indented by one level (one level means by one tab) compared to the line which contains the opening brace {.

Note: Usually after a opening brace {, we press the ENTER ¬  key to go to next line, where a tab is automatically inserted for indentation.

Below example shows the usage of spaces and tabs:
public class SpacesAndTabsDemo {
———public static void main(String[] args) {
——————for (int i = 0; i < 5; i++) {
—————————System.out.println("i = " + i);
——————}
———}
}

  orange borders mark spaces
——— pink borders mark tabs
See and retype the below code, make sure to use spaces and tabs appropriately.

Note: Please don't change the package name.
Answer :-

*/

package q10798;
public class SpacesAndTabsDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
		}
	}
}