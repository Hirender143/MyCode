package Super_and_protected_cn;

class vehicle_2 extends Vehicle{
    float milage;
    
    public void print() {
    	super.print();
    	System.out.println("Milage of vehicle_2"+milage);
    }
    
    public vehicle_2(float milage, int maxspeed) {
    	super(maxspeed);
    	this.milage=milage;
    	System.out.println("Vehicle_2 constructor");
    }
    
    

}
