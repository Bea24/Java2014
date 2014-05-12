package catalog;

public class ArrayEx {

	public static void main(String[] args) {
		
		String[] sa= new String[5];
		
		System.out.println(sa[0]); //result =0
		//String s =sa[0].toLowerCase(); //gets error
		
		sa[0]="First";
		//sa[1]="Second";
		sa[2]="Third";
		sa[3]="Fourth";
		sa[4]="Fifth";
		
		System.out.println(sa[0]);
		
		for(int i=0; i<sa.length; i++){ //I declare i here
			if(sa[i]!=null){		
				System.out.println(i + ":" + sa[i]);
			}else{
				System.out.println(i + ": <missing>");
			}
			
		}
		//other mode, but without index
		for(String e : sa){ //for each string e in sa
			//same to define j as c-for and then string e=sa[j]
			if(e!=null){
				System.out.println(e);
			}else{
				System.out.println("<missing>");
			}
		}
	}

}
