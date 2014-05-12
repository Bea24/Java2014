package company;

public class castex {

	public static void main(String[] args) {
		
		String s = "hello!";
		
		Object o = s; //not cast needed, implicit
		
		String t = (String)o;  // down-cast (must be explicit)
		
		
		Integer i = (Integer)(Object)s; // tricky 
			// accepted by the compiler
			// nonetheless an ERROR!

	}

}
