package EXTRA_PRACTICE_CODE;
import java.util.*;

public class Simple_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double r;double cubesum=0; double len=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER NUM: ");
		double num = sc.nextInt();
		
		while(num!=0) {
			num=num/10;
			len++;
		}
		
		if(num<1) {
			r= num%10;
			cubesum+= Math.pow(num,len);
			num/=10;
			}
		System.out.println(cubesum);
		
		

	}

}
