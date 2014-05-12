package catalog;

public class ExampleSingleton {

	public static void main(String[] args) {
		System.out.println("At the begginig of main");
		
		//SimpleClass single = SimpleClass.getSingleIstance();
		SimpleClass.singleton.getI();
		//structurally similar to
		System.out.println();
		
		System.out.println("End.");
	}

}
