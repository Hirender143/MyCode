package in.my.inheritance;

public class Main {
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1= new Cat();
		Animal a1 = new Animal();
		
		
		a1.describe();
		c1.make_sound();
		d1.make_sound();
		
		
	}

}
