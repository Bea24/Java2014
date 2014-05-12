package catalog;

public class StaticEx {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
		//StaticEx dummy = new StaticEx();
		//int avg = dummy.average(array);
		int avg = StaticEx.average(array); //declaring static method after
		//referring to current obj and not class
		
		double result = Math.log(9);
	}
	
	static int average(int[] a){
		int sum=0;
		for (int i : a){
			sum+=i;
		}
		return sum/a.length;
	}

}
