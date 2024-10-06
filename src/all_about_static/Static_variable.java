package all_about_static;

public class Static_variable {
	
	String name;
	int rollno;
	static String cllg_name="CHITKARA UNIVERSITY";
	
	public Static_variable(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}

	
	
	public void print() {
		System.out.println(name+" "+rollno+" "+cllg_name);
	}
}
