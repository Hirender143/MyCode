package EXTRA_PRACTICE_CODE;

public class Student_use {
	
	
	String name;
	int mathmarks;
	int s_marks;
	
	public Student_use(String name,int mathmarks,int s_marks) {
		this.name= name;
		this.mathmarks= mathmarks;
		this.s_marks= s_marks;
	}
	public void print() {
		System.out.println(name+" : "+mathmarks+" : "+s_marks);
	}
	
	public void comparemarks(Student_use other) {
		if(this.mathmarks > other.mathmarks && this.s_marks> other.s_marks) {
			System.out.println(this.name+" +have highest marks as compare to "+other.name);
		}
		else if(this.mathmarks < other.mathmarks && this.s_marks< other.s_marks) {
			System.out.println(other.name+" have highest marks as compare to "+this.name);
		}
		else  {
			System.out.println("Both are equal marks");
		}
		
		
		
	}
	

}
