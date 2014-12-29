package tylerandzack.creations.innersoulgame.windows;

import javax.swing.JFrame;

import tylerandzack.creations.innersoulgame.InnerSoul;
import tylerandzack.creations.innersoulgame.keylisteners.GameKeyListener;

public class Game {

	public static JFrame frame = new JFrame();

	public Game(int width, int height, String title, InnerSoul innerSoul) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new GameKeyListener(this));
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.setResizable(false);
		frame.setVisible(true);

		innerSoul.start();
	}
}