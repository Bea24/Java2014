package sorting;

public class ExSorting {
	
	public static void sort(Person[] a){
		
	}

	public static void main(String[] args) {
		
		Person[] people = {
				new Person ("Mario","Rossi","+390116601324"),
				new Person ("John","Smith","+390116603500"),
				new Person ("Mary","Black","+390116603822"),
		};
		
		sort(people);
		for(Person s: people){
			System.out.println(s);			
		}
		

	}

}
