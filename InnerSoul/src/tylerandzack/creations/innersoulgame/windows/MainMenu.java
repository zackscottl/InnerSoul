package tylerandzack.creations.innersoulgame.windows;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import tylerandzack.creations.innersoulgame.keylisteners.MainMenuKeyListener;

public class MainMenu {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel playLabel = new JLabel("Play"), optionsLabel = new JLabel("Options"), aboutLabel = new JLabel("About"), exitLabel = new JLabel("Exit");

	public int menuState;
	
	public MainMenu(String TITLE, int WIDTH, int HEIGHT) {
		frame.setTitle(TITLE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.addKeyListener(new MainMenuKeyListener(this));
		frame.setLocationRelativeTo(null);
		//frame.setResizable(false);
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.setBackground(Color.DARK_GRAY);

		//System.out.println(Color.DARK_GRAY.toString());

		drawContents();
	}

	public void drawContents() {		
		playLabel.setFont(new Font("verdana", Font.PLAIN, 48));
		playLabel.setForeground(Color.RED);
		
		optionsLabel.setFont(new Font("verdana", Font.PLAIN, 48));
		optionsLabel.setForeground(Color.WHITE);
		
		aboutLabel.setFont(new Font("verdana", Font.PLAIN, 48));
		aboutLabel.setForeground(Color.WHITE);
		
		exitLabel.setFont(new Font("verdana", Font.PLAIN, 48));
		exitLabel.setForeground(Color.WHITE);
		
		panel.add(playLabel);
		panel.add(optionsLabel);
		panel.add(aboutLabel);
		panel.add(exitLabel);
	}

	public void changeMenuState(boolean up) { // true if user presses up, false is user presses down
		switch (menuState) {
		case 0:
			if (up) {
				menuState = 3;
				playLabel.setForeground(Color.WHITE);
				optionsLabel.setForeground(Color.WHITE);
				aboutLabel.setForeground(Color.WHITE);
				exitLabel.setForeground(Color.RED);
			} else {
				menuState = 1;
				playLabel.setForeground(Color.WHITE);
				optionsLabel.setForeground(Color.RED);
				aboutLabel.setForeground(Color.WHITE);
				exitLabel.setForeground(Color.WHITE);
			}
			System.out.println(menuState);
			break;
		case 1:
			if (up) {
				menuState = 0;
				playLabel.setForeground(Color.RED);
				optionsLabel.setForeground(Color.WHITE);
				aboutLabel.setForeground(Color.WHITE);
				exitLabel.setForeground(Color.WHITE);
			} else {
				menuState = 2;
				playLabel.setForeground(Color.WHITE);
				optionsLabel.setForeground(Color.WHITE);
				aboutLabel.setForeground(Color.RED);
				exitLabel.setForeground(Color.WHITE);
			}
			System.out.println(menuState);
			break;
		case 2:
			if (up) {
				menuState = 1;
				playLabel.setForeground(Color.WHITE);
				optionsLabel.setForeground(Color.RED);
				aboutLabel.setForeground(Color.WHITE);
				exitLabel.setForeground(Color.WHITE);
			} else {
				menuState = 3;
				playLabel.setForeground(Color.WHITE);
				optionsLabel.setForeground(Color.WHITE);
				aboutLabel.setForeground(Color.WHITE);
				exitLabel.setForeground(Color.RED);
			}
			System.out.println(menuState);
			break;
		case 3:
			if (up) {
				menuState = 2;
				playLabel.setForeground(Color.WHITE);
				optionsLabel.setForeground(Color.WHITE);
				aboutLabel.setForeground(Color.RED);
				exitLabel.setForeground(Color.WHITE);
			} else {
				menuState = 0;
				playLabel.setForeground(Color.RED);
				optionsLabel.setForeground(Color.WHITE);
				aboutLabel.setForeground(Color.WHITE);
				exitLabel.setForeground(Color.WHITE);
			}
			System.out.println(menuState);
			break;
		}
	}

}
