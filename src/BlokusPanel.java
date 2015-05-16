import java.awt.Dimension;

import javax.swing.JPanel;


public class BlokusPanel extends JPanel{
	public BlokusPanel(){
		super();
		setPreferredSize(new Dimension(1200,800));
		BlokusBoard = new BlokusBoard(this);
	}

}
