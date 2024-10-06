package all_about_static;

public class Static_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Static_variable student1 = new Static_variable("Alice", 101);
        Static_variable student2 = new Static_variable("Bob", 102);
        
      //we can change the college of all objects by the single line of code  
        Static_variable.cllg_name="CHANDIGARH UNIVERSITY";
        
        student1.print();
        student2.print();
        	}

}
