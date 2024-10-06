//The toString() method in Java is a pre-existing method found in the Object class.
//It serves the purpose of returning a string representation of an object. 
//By default, it produces a string comprising the object's class name, 
//followed by an "@" symbol and hash code

package toString_method;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}

	public static void main(String[] args) {
		Person person = new Person("John Doe", 25);
		System.out.println(person);
	}
}
