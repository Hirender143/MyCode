package classes_and_object;

public class Fraction {
	int num;
	private int den;
	

	public Fraction(int n,int d) {
		num=n;
		den=d;
		
	}
	
	public void setden(int d) {
		if(d<=0) {
			return;
		}
		den = d;
	}
	
	public int getden() {
		return den;
	}
	
	public void print() {
		System.out.println(num+" : "+den);
	}

}
