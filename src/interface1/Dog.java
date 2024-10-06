package interface1;

public class Dog implements Animal {

	@Override
	public void makesound() {
		System.out.println("makesound dog invoked");
		
	}

	@Override
	public void eat() {
		System.out.println("EAT dog INVOKED");
		
	}

}
