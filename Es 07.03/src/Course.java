
public class Course {
	//attributes	
	private int code;
	private String name;
	private int credits;
	private String description;
	
	//constructor	
	public Course(){
		code=1;
		name="??";
		credits=6;
		description="something";
	}
	
	//methods	
	public void printDetails(){
		//here write statements to print details
		System.out.println(code);
		System.out.println(name);
		System.out.println(credits);
		System.out.println(description);
	}
	
	public int getCredits(){
		return -1;
	}
}
