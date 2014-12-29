package tylerandzack.creations.innersoulgame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.LinkedList;

import tylerandzack.creations.innersoulgame.objects.Object;
import tylerandzack.creations.innersoulgame.windows.MainMenu;

public class InnerSoul extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	public LinkedList<Object> object = new LinkedList<Object>();	
	private Object tempObject;
	private boolean running = false;
	public int frames, ticks;
	public String LEVEL = "start";

	Thread thread;

	private void init() {
		new PlaySound("footsteps", 3);
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
				if (GlobalVars.printFPS) {
					System.out.println("FPS: " + frames + " TICKS: " + ticks);
				}
				frames = 0;
				ticks = 0;
			}
		}
	}

	private void tick() {
		for (int i = 0; i < object.size(); i++) {
			tempObject = object.get(i);
			tempObject.tick(object);
		}
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		//Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		for (int i = 0; i < object.size(); i++) {
			tempObject = object.get(i);
			tempObject.render(g);
		}
	}

	public static void main(String[] args) {
		new MainMenu(true);
	}
}
