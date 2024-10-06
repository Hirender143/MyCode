package generic2;

public class Student<T, V> {

	private T name;
	private V id;

	public Student(T name, V id) {
		super();
		this.name = name;
		this.id = id;
	}

//	public T getName() {
//		return name;
//	}
//
//	public void setName(T name) {
//		this.name = name;
//	}
//
//	public V getId() {
//		return id;
//	}
//
//	public void setId(V id) {
//		this.id = id;
//	}
	public void print() {
		System.out.println(name+" "+id);
	}

}
