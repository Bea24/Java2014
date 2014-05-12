package catalog;

public class Example {

	public static void main(String[] args) {
		
		Course c;
		
		c= new Course(1,"00P",6,"Mainly Java Programming");
		Course db= new Course(2,"Databases",6,"SQL and db design");
		
		c.printDetails(); //mex=method name
		db.printDetails();
		
		Catalog cat= new Catalog();
		cat.addCourse(c);
		cat.addCourse(db);
		
		Course[] sixCredits=cat.selectCourse(6);
		System.out.println("Selected course ("+ sixCredits.length + "):");
		
		for(Course e: sixCredits){
			e.printDetails();
		}
	}

}
