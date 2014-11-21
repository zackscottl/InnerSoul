package tylerandzack.creations.innersoulgame.windows;

import java.awt.Color;

import javax.swing.JFrame;

import tylerandzack.creations.innersoulgame.InnerSoul;
import tylerandzack.creations.innersoulgame.keylisteners.GameKeyListener;

public class Game implements Runnable {

	public static Game game = new Game();

	public JFrame frame = new JFrame();

	private boolean running = false;

	public int frames, ticks;

	Thread thread;

	public Game() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new GameKeyListener(this));
		frame.setSize(InnerSoul.WIDTH, InnerSoul.HEIGHT);
		frame.setTitle(InnerSoul.TITLE);
		frame.setResizable(false);
		frame.setVisible(true);

		start();
	}

	private void init() {
	}

	public synchronized void start() {
		if (running)
			return;

		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		running = false;
	}

	public void run() {
		init();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		int ticks = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				ticks++;
				delta--;
			}

			render();
			frames++;
			if (frames > 500) {
				frames = 500;
			}

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				this.frames = frames;
				this.ticks = ticks;
				if (InnerSoul.printFPS) {
					System.out.println("FPS: " + frames + " TICKS: " + ticks);
				}
				frames = 0;
				ticks = 0;
			}
		}
	}

	private void tick() {
	}

	private void render() {
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	}

}
