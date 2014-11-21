package tylerandzack.creations.innersoulgame.keylisteners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import tylerandzack.creations.innersoulgame.windows.MainMenu;
import tylerandzack.creations.innersoulgame.windows.About;

public class AboutKeyListener extends KeyAdapter {

	About about;

	public AboutKeyListener(About about) {
		this.about = about;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_ENTER) {
			about.frame.setVisible(false);
			new MainMenu(true);
		}
	}
}
