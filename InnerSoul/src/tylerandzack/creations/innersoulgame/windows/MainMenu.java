package tylerandzack.creations.innersoulgame.windows;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainMenu {

	public MainMenu(String TITLE, int WIDTH, int HEIGHT) {
		JFrame frame = new JFrame(TITLE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
