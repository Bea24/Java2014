 

import catalog.Catalog;

//package catalog;

public class CliExample {

	public static void main(String[] args) {
		
		Catalog cat = new Catalog("Computer Engineering (Ingegneria Informatica )");
		Catalog cat1 = new Catalog("Computer Engineering (Ingegneria Informatica )");
		Catalog cat2 = new Catalog();
		
		//cat.setName("Computer Engineering (Ingegneria Informatica )");
		//or in base of wich method is to be used
		cat.setName("Computer Engineering","Ingegneria Informatica");
		System.out.println("Welcome to the catalog " + cat.getName());
		
		// if name was public I could do direct access
		//cat.name="Compu ter Engineering";
		//System.out.println("Welcome to the catalog " + cat.name);
		
		//cat.name=null;
		
		//SimpleClass simple =  new SimpleClass(); //no constructor defined, provided one default by eclipse
		//SimpleClass simple =  new SimpleClass().getSingleIstance();
	}

}
