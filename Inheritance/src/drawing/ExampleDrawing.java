package drawing;

public class ExampleDrawing {

	public static void main(String[] args) {
		
		//1. built figure
		Figure f=new Figure();
		
		Rectangle r= new Rectangle(4,1,5,3);
		
		f.add(r);
		
		//2. draw it
		Canvas c= new Canvas(15,5); 
		c.draw(f);
		
		
	}

}
