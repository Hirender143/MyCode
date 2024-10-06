package exceptionHandling1;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int a=10,b=0,c;
		
		try{
		    c=a/b;
		System.out.print(c);
		}
		
		catch(ArithmeticException e){
		    System.out.print("ArithmeticException");
		}
	}
}