package superkeyword;

public class Grade extends Student {

	String Subject;
	int num;

	public Grade(String name, int id, int num, String Subject) {
		super(name, id);
		this.Subject = Subject;
		this.num = num;
	}

	public void print() {
		super.display();
		System.out.println(Subject+" "+num);

	}

}
