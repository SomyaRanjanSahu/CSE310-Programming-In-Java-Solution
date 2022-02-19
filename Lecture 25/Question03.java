/* 

The toString() is a special method because when the object is involved in the string concatenation then the toString() method returns the String representation of that object. Hence a toString() method's return type is String and it does not take any parameters.

Identify and correct the errors based on the above information provided. Hint: Press Submit to find out the error.

Note: Please don't change the package name

*/

package q11125;
public class Student {
	private String id;
	private String name;
	private int age;
	private char gender;
	
	public Student(String id, String name, int age, char gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", age = " + age + ", gender = " + gender + "]";
	}
}