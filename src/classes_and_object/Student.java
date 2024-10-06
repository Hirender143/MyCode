package classes_and_object;

public class Student {

	String name;
	private int Roll_num;
	
	public Student(String name, int Roll_num) {
		this.name = name;
		this.Roll_num=Roll_num;
	
	}
	
//	public void setRoll_num(int rn) {
//		if(rn<=0) {
//			return;
//		}
//		Roll_num =rn;
//	}
//	
//	
//	
//	
//
//	public int getRoll_num(){
//		return Roll_num;
//	}
	public void print() {
		System.out.println(name+" : "+Roll_num);
	}
}
