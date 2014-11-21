package tylerandzack.creations.innersoulgame.keylisteners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import tylerandzack.creations.innersoulgame.windows.MainMenu;
import tylerandzack.creations.innersoulgame.windows.Options;

public class OptionsKeyListener extends KeyAdapter {

	Options options;

	public OptionsKeyListener(Options options) {
		this.options = options;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_ENTER) {
			options.frame.setVisible(false);
			new MainMenu(true);
		}
	}
}
