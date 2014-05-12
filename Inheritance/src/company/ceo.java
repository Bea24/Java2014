package company;

public class ceo extends manager{
	
	public ceo(String name, double salary, String dep){
		super(name,salary,dep); //can't be omitted, I have to initialize
		//..	
	}		
	
	public void increasesalary(double by){
		salary *= by;
	}
}
