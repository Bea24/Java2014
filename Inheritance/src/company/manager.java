package company;

public class manager extends employee { //changes made on employee are effective also here
	//inherited
	//private String name;
	//private double salary;
	private String department;
	
	public manager(String name, double salary, String dep){
		//this.name=name; //not visible because private
		//this.salary=salary; //not visible because private
		//to initialize manager objs I use constructors
		//pass name and salary par to employee constructor
		//employee(name, salary); //invalid syntax
		super(name, salary); //initialization obj of base class
		this.department = dep; //initialization, can't be before upper line!
	}
	
	//inherited
	//public String  toString(){
	//	return name + "(" + salary + ")";
	//}
	
	//OVERRIDE
	public String toString(){
		//return super.toString() + ", department " + department;
		return name + ", department: " + department; 
	} //use super to refer to main class

}
