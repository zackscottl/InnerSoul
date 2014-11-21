package tylerandzack.creations.innersoulgame.windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import tylerandzack.creations.innersoulgame.InnerSoul;
import tylerandzack.creations.innersoulgame.keylisteners.MainMenuKeyListener;

public class MainMenu {

	public static MainMenu mainMenu;

	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JLabel playLabel = new JLabel("Play"), optionsLabel = new JLabel("Options"), aboutLabel = new JLabel("About"), exitLabel = new JLabel("Exit");

	public int menuState;

	public MainMenu(boolean create) {
		if (create) {
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.addKeyListener(new MainMenuKeyListener(this));
			frame.setSize(InnerSoul.WIDTH, InnerSoul.HEIGHT);
			frame.setLocationRelativeTo(null);
			frame.setTitle(InnerSoul.TITLE);
			frame.setResizable(false);
			frame.add(panel);
			
			panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
			panel.setBackground(Color.DARK_GRAY);

			drawContents();
			} else {
				return;
		}
	}

	public void drawContents() {
		try {
			InputStream inputStream = getClass().getResourceAsStream("/font.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream).deriveFont(Font.PLAIN, 55);
			GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
			genv.registerFont(font);

			playLabel.setFont(font);
			playLabel.setForeground(Color.RED);

			optionsLabel.setFont(font);
			optionsLabel.setForeground(Color.WHITE);

			aboutLabel.setFont(font);
			aboutLabel.setForeground(Color.WHITE);

			exitLabel.setFont(font);
			exitLabel.setForeground(Color.WHITE);

			panel.add(playLabel);
			panel.add(optionsLabel);
			panel.add(aboutLabel);
			panel.add(exitLabel);
			
			frame.setVisible(true);
			mainMenu = new MainMenu(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
