package tylerandzack.creations.innersoulgame.windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import tylerandzack.creations.innersoulgame.InnerSoul;
import tylerandzack.creations.innersoulgame.keylisteners.OptionsKeyListener;

public class Options {
	
	public static Options options = new Options();

	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JLabel infoLabel = new JLabel("Coming Soon!"), backLabel = new JLabel("Back");

	public int menuState;

	public Options() {
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.addKeyListener(new OptionsKeyListener(this));
		frame.setSize(InnerSoul.WIDTH, InnerSoul.HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setTitle(InnerSoul.TITLE);
		frame.setResizable(false);
		frame.add(panel);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.setBackground(Color.DARK_GRAY);

		drawContents();
	}

	public void drawContents() {
		try {
			InputStream inputStream = getClass().getResourceAsStream("/font.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream).deriveFont(Font.PLAIN, 55);
            GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
			genv.registerFont(font);
			
			infoLabel.setFont(font);
			infoLabel.setForeground(Color.WHITE);
			
			backLabel.setFont(font);
			backLabel.setForeground(Color.RED);

			panel.add(infoLabel);
			panel.add(backLabel);
			
            frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}   
	}

}
