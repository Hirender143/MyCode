package string;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" hloo@ :HLOO678 ";
		
		String cleaned = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(cleaned);

	}

}
