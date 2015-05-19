import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;


public class MyListener extends MouseInputAdapter {
	BlokusPanel panel;
	
	public MyListener(BlokusPanel bp){
		super();
		panel = bp;
	}
	public void mousePressed(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		if(panel.insideUsablePiece(x,y))
			panel.grabPiece(x,y);
			}
	
}
