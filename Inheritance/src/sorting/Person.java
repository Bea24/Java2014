package sorting;

public class Person {
	
	public Person(String first, String last, String phone) {
		super();
		this.first = first;
		this.last = last;
		this.phone = phone;
	}
	
	private String first;
	private String last;
	private String phone;
	
	public String toString(){
		return first + " " + last + " (" + phone + ")";
	}

}
