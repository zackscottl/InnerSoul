package tylerandzack.creations.innersoulgame.keylisteners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import tylerandzack.creations.innersoulgame.InnerSoul;
import tylerandzack.creations.innersoulgame.windows.About;
import tylerandzack.creations.innersoulgame.windows.Game;
import tylerandzack.creations.innersoulgame.windows.MainMenu;
import tylerandzack.creations.innersoulgame.windows.Options;

public class MainMenuKeyListener extends KeyAdapter {

	public MainMenu mainMenu;

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
			if (mainMenu.menuState == 0) {
				mainMenu.frame.setVisible(false);
				new Game(800, 600, "InnerSoul", new InnerSoul());
			} else if (mainMenu.menuState == 1) {
				mainMenu.frame.setVisible(false);
				Options.options.frame.setVisible(true);
			} else if (mainMenu.menuState == 2) {
				mainMenu.frame.setVisible(false);
				About.about.frame.setVisible(true);
			} else if (mainMenu.menuState == 3) {
				System.exit(0);
			}
		}
	}
}
