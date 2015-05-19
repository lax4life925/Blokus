import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public abstract class Piece {
	List<Block> blockList = new ArrayList<Block>();
	 Color color;
	 int x = 10;
	 int y = 10;
	public Piece(Player p){
		color = p.getColor();
	}
	
	public void flipVertically(){
		for(Block b : blockList){
			b.setRelativeLoc(b.getRelativeLocX(), b.getRelativeLocY()*-1);
		}
	}
	public void flipHorizontally(){
		for(Block b : blockList){
			b.setRelativeLoc(b.getRelativeLocX()*-1, b.getRelativeLocY());
		}
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.color);
		for(Block b : blockList){
			int xLoc = b.getRelativeLocX()*Block.SIZE + x;
			int yLoc = b.getRelativeLocY()*Block.SIZE + y;
			g.setColor(this.color);
			g.fillRect(xLoc, yLoc, Block.SIZE, Block.SIZE);
			g.setColor(Color.BLACK);
			g.drawRect(xLoc, yLoc, Block.SIZE, Block.SIZE);
		}
	}
	
}
