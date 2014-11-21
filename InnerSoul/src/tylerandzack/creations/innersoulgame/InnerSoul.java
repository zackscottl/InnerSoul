package tylerandzack.creations.innersoulgame;

import tylerandzack.creations.innersoulgame.windows.MainMenu;
import tylerandzack.creations.innersoulgame.windows.Options;

public class InnerSoul {

	public static String TITLE = "Inner Soul";
	public static int WIDTH = 400, HEIGHT = 400;
	public static boolean printFPS = true;

	static MainMenu mainMenu;
	static Options options;

	public static void main(String[] args) {
		new MainMenu(true);
	}
}
