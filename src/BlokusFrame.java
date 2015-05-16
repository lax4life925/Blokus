import java.awt.BorderLayout;

import javax.swing.JFrame;


public class BlokusFrame extends JFrame {
	int playerNum = 0;
	public BlokusFrame(){
		super("Blokus");
		setLayout(new BorderLayout());
		createMenus();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setBounds(0,0,1200,800);
		pack();
		addPanel();
		setResizable(false);
		
	}

	private void addPanel() {
		BlokusPanel bp = new BlokusPanel();
		this.add(bp);
		pack();
	}

	private void createMenus() {
		// TODO Auto-generated method stub
		
	}

	

	
}
