package genricmethod;

public class Array {
	
	public static<T> void print(T p[]) {
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i]+" ");
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Integer p[]= new Integer[10];
		
		for(int i=0;i<10;i++) {
			p[i]=i+1;
		}
		
		print(p);
		
	}
	
	

}
