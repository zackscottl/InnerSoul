package tylerandzack.creations.innersoulgame.keylisteners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import tylerandzack.creations.innersoulgame.windows.Game;

public class GameKeyListener extends KeyAdapter {

	public Game game;

	public GameKeyListener(Game game) {
		this.game = game;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			// Something
		}
	}
}
