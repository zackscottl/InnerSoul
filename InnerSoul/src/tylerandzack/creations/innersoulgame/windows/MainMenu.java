package tylerandzack.creations.innersoulgame.windows;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import tylerandzack.creations.innersoulgame.keylisteners.MainMenuKeyListener;

public class MainMenu {

	JFrame frame = new JFrame();

	public int menuState;

	public MainMenu(String TITLE, int WIDTH, int HEIGHT) {
		frame.setTitle(TITLE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.addKeyListener(new MainMenuKeyListener(this));
		frame.setLocationRelativeTo(null);
		//frame.setResizable(false);
		frame.setVisible(true);

		drawContents();
	}

	public void drawContents() {
		JLabel playLabel = new JLabel("Play");
		playLabel.setFont(new Font("verdana", 0, 20)); //First arg: font name, Second arg: style; 0 = normal, 1 = bold, 2 = italic, 3 = bold and italic, Third args: size of font
		frame.add(playLabel);
	}

	public void changeMenuState(boolean up) { // true if user presses up, false is user presses down
		switch (menuState) {
		case 0:
			if (up) {
				menuState = 3;
			} else {
				menuState = 1;
			}
			System.out.println(menuState);
			break;
		case 1:
			if (up) {
				menuState = 0;
			} else {
				menuState = 2;
			}
			System.out.println(menuState);
			break;
		case 2:
			if (up) {
				menuState = 1;
			} else {
				menuState = 3;
			}
			System.out.println(menuState);
			break;
		case 3:
			if (up) {
				menuState = 2;
			} else {
				menuState = 0;
			}
			System.out.println(menuState);
			break;
		}
	}

}
