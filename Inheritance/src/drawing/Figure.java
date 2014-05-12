package drawing;

public class Figure extends Shape {
	
	private static final int MAX_ELEMENTS = 10;
	private Shape[] elements = new Shape[MAX_ELEMENTS];
	
	public void add(Shape s){
		for(int i=0; i<elements.length; ++i){
			if(elements[i] == null){
				elements[i] = s;
				break;
			}
		}
	}

	public void draw(Canvas c) {
		for(Shape s:elements){
			if(s!=null){
				s.draw(c);
			}
			
		}
		
	}
}
