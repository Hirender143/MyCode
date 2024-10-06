//Create a base class called "Person" with attributes like "name" and "age." Derive two classes, "Student" and "Teacher," from the "Person" class.
//Include additional attributes and methods specific to each derived class. 
//Create objects of both "Student" and "Teacher" and display their respective details
package inheritance;

public class Person {
      protected int age;
      protected String name;
      
      public Person(int age, String name) {
    	  this.age=age;
    	  this.name=name;
      }
      
      public void print_person() {
    	  System.out.println("Person name: "+name);
    	  System.out.println("PERSON AGE: "+age);
    	  
      }
}

















