package sorting;

import java.util.Arrays;

public class ExSorting {
	
	public static void sort(Object[] a){
		
		for (int i=0; i<a.length; ++i){
			for(int j=0; i<a.length; ++i){
				GreaterThan first=(GreaterThan)a[j-1];
				GreaterThan second=(GreaterThan)a[j];
				if( first.isGreaterThan(second) ){
					Object p=a[j];
					a[j]=a[j-1];
					a[j-1]= p;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Person[] people = {
				new Person ("Mario","Rossi","+390116601324"),
				new Person ("John","Smith","+390116603500"),
				new Person ("Mary","Black","+390116603822"),
		};
		
		//sort(people);
		Arrays.sort(people); //error
		for(Person s: people){
			System.out.println(s);			
		}
		
		//String[] items = {"first","second","alpha","beta"};
		//sort(items); //error: not implements GreaterThan interface
		

	}

}
