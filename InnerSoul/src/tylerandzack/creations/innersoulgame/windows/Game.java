package tylerandzack.creations.innersoulgame.windows;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Game {

	public static boolean running = false;

	public Game(String TITLE, int WIDTH, int HEIGHT) {
		JFrame frame = new JFrame(TITLE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);

		running = true;
		start();
	}

	private void start() {
		if (running) {
			return;
		} else {
			running = true;
			run();
		}
	}
	
	private void init() {
		// Load key stuff before everything else
	}
	
	private void run() {
		while(running) {
			init();
			// Game runs here
		}
	}

}
