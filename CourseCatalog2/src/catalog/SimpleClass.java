package catalog;

public class SimpleClass {
	private int i;
	
	//default constructor
	//SINGLETON
	private SimpleClass(){
		System.out.println("Here I am");
	}
	
	public int getI(){
		return i;
	}
	
	//private static SimpleClass singleton;	
	//public static SimpleClass getSingleIstance(){
	//	if(singleton == null){
	//		return new SimpleClass();
	//	}
	//	return singleton;
	//}
	//easier way
	//private static SimpleClass singleton = new SimpleClass();
	//public static SimpleClass getSingleIstance(){
	//	return singleton;
	//}
	public final static SimpleClass singleton = new SimpleClass();
}
