package generics;

public class Pairuse {

	public static void main(String[] args) {

		Pair<String> p1 = new Pair<String>("kb", "ta");
		
		p1.setFirst("we");
		
		System.out.println(p1.getFirst());
		System.out.println(p1.getSecond());
		System.out.println("Type of first element of p1: " + p1.getFirst().getClass().getName());
		
		Pair<Integer> p2 = new Pair<Integer>(255,244);
		
		System.out.println(p2.getFirst());
		System.out.println(p2.getClass());
		System.out.println(p2.getSecond());
		
		System.out.println("Type of first element of p2: " + p2.getFirst().getClass().getName());
		
		

	}

}
