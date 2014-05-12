package company;

public class employee { //implicitly extends Object
	
	protected String name;
	protected double salary;
	protected int birthYear;
	
	public employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	
	public String  toString(){ //override of the toString in class Object
		return name + "(" + salary + ")";
	}
	
	public boolean equals(Object other){ // OVERRIDE
//		int i=10;
//		double d = (double)i;  // cast == conversion!!
		if( other instanceof Employee){
//			Employee otherEmployee = (Employee)other;  // no conversion
//			return this.name.equals( otherEmployee.name);
			return this.name.equals( ((Employee)other).name);
		}
		return false;
	}
	}
}
