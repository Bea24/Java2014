package drawing;

public class Rectangle implements Shape {
	
	private int x0;
	private int y0;
	private int width;
	private int height;

	public Rectangle (int x0, int y0, int width, int height){
		this.x0=x0;
		this.y0=y0;
		this.width=width;
		this.height=height;		
	}
	
	public void draw(Canvas c) {
		//do the actual rectangle drawing
		//Canvas.screen[][]="*"; //private and can't use name of class to access one element of a class
		for(int i=0;i<width;++i){
			c.setPixel(x0+i,y0);
		}
		for(int i=0;i<width;++i){
			c.setPixel(x0+i,y0+height);
		}
		for(int i=0;i<height;++i){
			c.setPixel(x0,y0+i);
		}
		for(int i=0;i<height;++i){
			c.setPixel(x0+width,y0+i);
		}
	}
	
}
