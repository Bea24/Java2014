package catalog;

	
	
public class Catalog {
	//associations
	private Course[] courses =new Course[MAX_COURSES];
	private String name = "(default catalog)";
	//private final int MAX_COURSES=100;  //we are creating one copy in each catalog obj
	private static final int MAX_COURSES=100; //has to be this way
	private int nextElement = 0;
			
	//constructor
	public Catalog(String catName){
		//courses =new Course[MAX_COURSES];
		//nextElement=0;
		name = catName;
	}
	
	public Catalog(String englishName, String italianName){
		//courses =new Course[MAX_COURSES];
		//nextElement=0;
		name = englishName + "(" + italianName + ")";
	}
	
	public Catalog(){ //to create catalog without name
		//courses =new Course[MAX_COURSES];
		//nextElement=0;
		//name = "(default catalog)";
	} //doesn't do anything but allows to create a new catalog without arguments->can't be removed
	              
		
	//methods
	public void addCourse(Course newCourse){
//		coursesInTheCatalog[nextElement++] = newCourse;
		// OR
		for(int i=0; i<courses.length; ++i){
			if(courses[i] == null){
				courses[i] = newCourse;
				break;
			}
		}
	}
	
	public Course[] selectCourse(int credits){
		//Course result[] = new Course[10];
		// preferred in Java:
		// A.1 find out how many courses fit the # credits
		int count=0;
		for(Course c : courses){
			if(c!=null && c.getCredits()==credits){
				count++;
			}
		}
		
		// 2. Create an array containing those courses
		Course[] result = new Course[count];
		
		// 1. Search the courses in the catalog
		//    having the specified number of credits
		int index=0;
		for(Course c : courses){
			if(c!=null && c.getCredits()==credits){
				result[index++] = c;
			}
		}
		
		return result;
	}
	
	
	//read attribute
	public String getName() { //getter
		return name;
	}
	//write attribute
	public void setName(String newName){ //setter
		//if (newName.equals(" ")) return; //wrong
		if (newName == null) return;
		if (newName.equals(" ")) return;
		if (newName.isEmpty()) return;
		name = newName; 
	}
	
	public void setName(String englishName, String italianName){
		name = englishName + "(" + italianName + ")";		
	}
}




