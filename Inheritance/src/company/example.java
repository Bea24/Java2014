package company;

public class example {

	public static void main(String[] args) {
		
		employee e1= new employee ("Smith", 1200.00);
		
		System.out.println("Employee e1: " + e1.toString());
		
		manager m1 = new manager ("Black", 12000.50, "IT");
		System.out.println("Manager m1: " + m1.toString());
		
		employee person = m1; //can do this because can referre to objs from every sub class
		
		//dynamic binding
		System.out.println ( person.toString() ); //referred to the manager version
		
		employee e2 = new employee("White", 1500);
		
		employee[] people = new employee[3];
		people[0] = e1;
		people[1] = e2;
		people[2] = m1;
		for(employee e : people){
			System.out.println(e.toString());
		}
		
		ceo theBoss = new ceo("Boss",1500000000,"the company");
		
		theBoss.increasesalary(1.5); //I can do it!
		person = theBoss; //I can do it!
		//person.increasesalary(1.5); //I can't do it X X X
		//I can invoke methos only defined in the class
	}

}
