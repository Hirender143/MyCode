package Super_and_protected_cn;

class Vehicle{
    String color;
    private int maxspeed;
    
    
    public Vehicle(int maxspeed) {
    	this.maxspeed= maxspeed;
    	System.out.println("vehicle constructor");
    }

    public int getMaxspeed() {
        return maxspeed;
    }
    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void print(){
       System.out.println("Color of vehicle: "+color);
        System.out.println("maxspeed of vehicle: "+maxspeed);

    }
}
