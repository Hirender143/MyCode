//Create a Person class with private fields for name, age, and email. Implement getter and setter methods to access and modify these fields.

package encapsulationdemo1;

public class Person {

	private String name;
	private int age;
	private String email;

	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

//	public void print() {
//		System.out.println(name + " " + age + " " + email);
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
