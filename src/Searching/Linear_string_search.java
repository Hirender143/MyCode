package Searching;
import java.util.*;
public class Linear_string_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string size: ");
		int size = sc.nextInt();
		sc.nextLine();            // consume the remaining newline character
		
		String[] str = new String[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("String"+(i+1)+": ");
			str[i]= sc.nextLine();
		}
		
		System.out.println("String you entered are: ");
		for(int i=0; i<size;i++) {
			System.out.println(str[i]+" ");
			
		}
		System.out.println("Which string you want to find:");
        String num = sc.nextLine();
        
        for(int i=0; i<size;i++) {
			if(str[i].equals(num)) {
				System.out.println("This string is at "+(i+1)+" index.");
			}
			
		}
	}

}
