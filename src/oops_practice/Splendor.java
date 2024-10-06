package oops_practice;

public class Splendor extends Vehicle {

	int modelno;
	int chesisno;

	public Splendor(int engine, String color, int modelno, int chesisno) {
		super(engine, color);
		this.modelno = modelno;
		this.chesisno = chesisno;
	}
	
	
	public void print() {
		System.out.println("splendor method invoked");
		super.print();
		System.out.println(modelno+" "+chesisno);
	}

}
