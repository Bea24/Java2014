package example.string; //LOCATION is example/string/

public class StringEx {

	public static void main(String[] args) {

		String s;
		
		s="ABC"; //shortcut for the following.. translated by compiler
		//s=new String("ABC");
		
		//String t="ABC"; //compiler not create new one but reuses same obj
		
		s.toLowerCase(); 
		
		System.out.println(s); //we get ABC not abc because we have def a const and can't be replaced. this f creates a copy with abc
		
		s=s.toLowerCase(); 
		
		System.out.println(s); //we get abc but lost first string, no reference anymore to that obj -> garbage
		
		String message= "The value of s is " + s; //Concatenated strings
		//String message= new String ("The value of s is ") + s; 	//same	
		System.out.println(message);
		
		int i=5;
		
		message= "The value of i is=" +i;
		
		System.out.println(message);
		
		String t = null;
		//s = t.toLowerCase();
		
		int l=message.length();
		
		String v=message.substring(4,9); //to print 'value' of message, firstIndex=first char included secondIndex=blank after word
		System.out.println(">"+v+"<");
		
		int position=message.indexOf("value");
		int posBlank=message.indexOf(" ",position); //start to search from previous position
		System.out.println(position);
		System.out.println(posBlank);
		
		s="ABC";
		t="abc";
		int comparison=s.compareTo(t); //0 if equal, -1 if s<t, +1 if s>t
		System.out.println(s+" vs. "+t+" = "+comparison);
		//EQUIVALENT
		StringBuffer b=new StringBuffer();
		b.append(s);
		b.append(" vs. ");
		b.append(t).append(" = ").append(comparison);
		System.out.println(b);
		
		
		s="Object";
		t="Object";
		if(s==t){
			System.out.println("==");
		}else{
			System.out.println("!=");
		} //== are the same!
		
		s=new String("Object");
		t=new String("Object");
		if(s==t){
			System.out.println("same obj");
		}else{
			System.out.println("distinct obj");
		} //!= are different!
		
		if(s.equals(t)){
			System.out.println("same content");
		}else{
			System.out.println("different content");
		} //are same
		
		
	
		
	}

}
