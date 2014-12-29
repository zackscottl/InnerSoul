package tylerandzack.creations.innersoulgame.windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tylerandzack.creations.innersoulgame.GlobalVars;
import tylerandzack.creations.innersoulgame.keylisteners.OptionsKeyListener;

public class Options {

	public static Options options = new Options();

	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JLabel infoLabel = new JLabel("Coming Soon!"), backLabel = new JLabel("Back");

	public int menuState;

	public Options() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new OptionsKeyListener(this));
		frame.setSize(GlobalVars.WIDTH, GlobalVars.HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setTitle(GlobalVars.TITLE);
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
			backLabel.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					new MainMenu(true);
				}
			});

			panel.add(infoLabel);
			panel.add(backLabel);

			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
