 
public class Course {
	//attributes	
	private int code;
	private String name;
	private int credits;
	private String description;
	
	//constructor	
	public Course(int code, String myName, int myCredits, String myDescription){
		//code=myCode; //if I use code instead of myCode I've no error but a self assignment  
		this.code/*attribute*/=code/*argument*/;
		//this=the current obj
		name=myDescription;
		credits=myCredits;
		description=myDescription;
	}
	
	//methods	
	public void printDetails(){
		//here write statements to print details
		System.out.println("Code: "+this.code); //this auto added, can be not written
		System.out.println("Name: "+name);
		System.out.println("CFU: "+credits);
		System.out.println("Description: "+description);
	}
	
	public int getCredits(){
		return credits; //before was -1 when we had no concatenated strings
	}
}
