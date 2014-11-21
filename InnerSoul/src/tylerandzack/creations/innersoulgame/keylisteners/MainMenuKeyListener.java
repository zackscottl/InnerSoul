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
			if (mainMenu.menuState == 0) {
				// Play game
				System.out.println("play");
			} else if (mainMenu.menuState == 1) {
				// Show options
				System.out.println("options");
			} else if (mainMenu.menuState == 2) {
				// Show about
				System.out.println("about");
			} else if (mainMenu.menuState == 3) {
				// Exit
				System.out.println("exit");
				System.exit(0);
			}
		}
	}
}
