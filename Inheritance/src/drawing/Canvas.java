package drawing;

public class Canvas {

	private static final char BACKGROUND_CHAR = '.';
	private static final char FOREGROUND_CHAR = '*';
	private char[][] screen;
	
	public Canvas(int width, int height) {
		screen = new char[width][height];
		//clear screen
		for(int i =0; i<width; ++i){
			for (int j=0; j<height; ++j){
				screen[i][j]=BACKGROUND_CHAR;
			} 
		}
	}

	public void draw(Shape f){
		//1. draw
		
		//for(Shape s: f.elements){
		//	if(s instanceof Rectangle /*is a rectangle*/){
		//		//draw rectangle
		//	}
		//	if(s /*is a circle)*/{
		//		//draw circle
		//	}
		//}
		f.draw(this); //delegate all to Figure that delegates to Shape
	
		//2.print
		for(int i =0; i<screen[0].length; ++i){
			for (int j=0; j<screen.length; ++j){
				System.out.println(screen[j][i]);
			}
			System.out.println("\n");			
	    }
	
	}
	
	public void setPixel(int x, int y){
		screen[x][y]=FOREGROUND_CHAR;
	}
}
