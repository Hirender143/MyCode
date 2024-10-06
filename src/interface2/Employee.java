/**
 * 
 */
package interface2;

/**
 * 
 */
public interface Employee {
	
     abstract void FirstName();
     default void surname() {
		System.out.println("PAL");;
	}
     

}
