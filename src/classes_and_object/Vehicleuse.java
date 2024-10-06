package classes_and_object;

import java.util.*;
public class Vehicleuse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vehical v = new Vehical();
		
		v.setmaxSpeed(125);
		v.color ="Gulabi";
		
		System.out.println("speed : "+v.getmaxSpeed()+" NAME : "+v.color);

	}

}
