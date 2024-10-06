package Practice_again;


class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}

class Airplane extends Vehicle {
    @Override
    public void move() {
        System.out.println("Airplane is flying");
    }
}

// In a language that allows multiple inheritance
class FlyingCar extends Car, Airplane {
   
	
    // Which move() method is inherited? Car's or Airplane's?
}


public class Ambiguity {

}
