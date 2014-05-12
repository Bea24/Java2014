package sorting;

public class Person implements GreaterThan, Comparable {
	
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
	
	
	//it has to be public
	public boolean isGreaterThan(GreaterThan o){
		Person other= (Person) o;
	
		int diffL= this.last.compareTo(other.last);
		
		if(diffL!=0){
			return diffL>0;
		}
		int diffF=this.first.compareTo(other.first);
		return diffF>0;	
		
	}
	
	public int compareTo(Object o){
		Person other = (Person)o;
		int diffL= this.last.compareTo(other.last);
		if(diffL!=0) return diffL;
		return this.first.compareTo(other.first);
	}
	

}
