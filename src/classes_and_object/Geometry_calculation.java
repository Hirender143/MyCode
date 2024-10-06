package classes_and_object;

public class Geometry_calculation {


    public class shape{
        public double area(){
            return 0.0;
        }
    }


    public class Circle extends shape{
        double radius;

        public Circle(double radius){
            this.radius=radius;
        }

        public double area(){
            return Math.PI*radius*radius;
        }
    }

    public static void main(String[] args) {
        
    }
    
}
