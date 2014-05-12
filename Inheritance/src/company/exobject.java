package company;

public class exobject {

	public static void main(String[] args) {
		employee e = new employee("John Smith", 12000);
		
		String s= e.toString();
		
		System.out.println("S= " +s); //if toString not existing in employee it calls the default from object
		//-> S= company.employee@2677622b
		System.out.println(e);
		
		employee[] employees = {
				new employee("John Smith",12000),
				new employee("Mary Black",15000)
		};
		
		boolean in = contains(employees,e);
		System.out.println("In: " + in);
		
	}
	
	static void printAnyObject(Object obj){
		String s = obj.toString();
		System.out.println(s);
	}

	static boolean contains(Object[] array){
		for(Object e: array){
			if(element.equals(e)) return
		}
		return false;
	}
}
