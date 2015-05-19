import java.awt.Color;
import java.awt.Graphics;


public class Block {

	public static final int SIZE = 25;
	private Color color;
	//used for pieces
		private int x;
		private int y;
	public Block(Color red) {
		// TODO Auto-generated constructor stub
		color = red;
	}

	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.red;
	}

	public void setRelativeLoc(int relativeLocX,int relativeLocY){
		x = relativeLocX;
		y = relativeLocY;
	}
	
	
	public int getRelativeLocX(){
		return x;
	}
	
	public int getRelativeLocY(){
		return y;
	}
}
