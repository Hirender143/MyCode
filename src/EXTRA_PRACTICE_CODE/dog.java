package EXTRA_PRACTICE_CODE;

public class dog {
	
	String name;
	int id;
	
	public dog(String name,int id) {
		this.id=id;
		this.name=name;
	}
}

class libra extends dog{
	String food;
	public libra(String name,int id, String food) {
		super(name,id); //calls the constructor of super class.
		this.food=food;
		
	}
	
	
	
}
	
	
	
	
	
	
	
	


