import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class BlokusPanel extends JPanel{
	BlokusBoard board;
	public BlokusPanel(){
		super();
		setPreferredSize(new Dimension(BlokusFrame.width,BlokusFrame.height));
		board = new BlokusBoard(this);
	}


	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		board.draw(g);
		test(g);
	}

	private void test(Graphics g) {
		// TODO Auto-generated method stub
		Piece p = new ThreeLong(new Player(Color.RED));
		p.setLoc(50, 50);
		p.draw(g);
		Piece p2 = new Corner(new Player(Color.red));
		p2.setLoc(100, 100);
		p2.draw(g);
	}



	public void grabPiece(int x, int y) {
		// TODO Auto-generated method stub
		
	}



	public boolean insideUsablePiece(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}




}
