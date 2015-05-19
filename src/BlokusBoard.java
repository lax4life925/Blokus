import java.awt.Color;
import java.awt.Graphics;


public class BlokusBoard {
	
	BlokusPanel blokusPanel;
	Block[][] arr;
	int sizeOfBoard = 20;
	int blockSize = Block.SIZE;
	public BlokusBoard(BlokusPanel bp) {
		// TODO Auto-generated constructor stub
		arr = new Block[sizeOfBoard][sizeOfBoard];
		this.blokusPanel = bp;
		arr[10][10] = new Block(Color.red);
		arr[12][10] = new Block(Color.red);
		arr[10][0] = new Block(Color.red);

	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		int sizeOfBlock  = blockSize;
		int w = BlokusFrame.width;
		int h = BlokusFrame.height;
		int horizontalBuffer = (w - sizeOfBoard*sizeOfBlock)/2;
		int verticalBuffer =  (h - sizeOfBoard*sizeOfBlock)/2;
		for(int r = 0; r < sizeOfBoard; r++){
			for(int c = 0; c < sizeOfBoard; c++){
				int x = horizontalBuffer + r*sizeOfBlock;
				int y = verticalBuffer + c*sizeOfBlock;
				if(arr[r][c] != null){
					g.setColor(arr[r][c].getColor());
					g.fillRect(x, y, sizeOfBlock, sizeOfBlock);
				}
				g.setColor(Color.black);
				g.drawRect(x, y, sizeOfBlock, sizeOfBlock);
			}
				
		}
	}

}
