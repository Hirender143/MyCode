package Functions;



public class Funct_smjho
{
    public static class shape{
        int l;
        int b;
        
        public static int calulateArea(int l,int b){
            return (l*b);
 //---only run in gdb yha changes krna pdega but good to understand return function or inheritance
        }
    }
public static class Rectangle extends shape{
    
    public int calculatePerimeter(int l,int b)
        return (2*(l+b));
    }
}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		

		
		Rectangle r1 =new Rectangle();
		
		r1.l=5;
		r1.b=7;
		
		int area = r1.calulateArea(r1.l,r1.b);
		int Perimeter = r1.calculatePerimeter(r1.l,r1.b);
		
		System.out.print("AREA : "+area+" Perimeter : "+Perimeter);
	}
}

