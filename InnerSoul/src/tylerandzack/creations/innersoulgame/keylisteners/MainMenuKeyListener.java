package tylerandzack.creations.innersoulgame.keylisteners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import tylerandzack.creations.innersoulgame.windows.MainMenu;

public class MainMenuKeyListener extends KeyAdapter {

	tylerandzack.creations.innersoulgame.windows.MainMenu mainMenu;

	public MainMenuKeyListener(MainMenu mainMenu) {
		this.mainMenu = mainMenu;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_UP) {
			mainMenu.changeMenuState(true);
		}
		if (key == KeyEvent.VK_DOWN) {
			mainMenu.changeMenuState(false);
		}

		if (key == KeyEvent.VK_ENTER) {

		}
	}
}
