package tylerandzack.creations.innersoulgame.objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

public class Player extends Object {

	public Player(double x, double y, ObjectId id) {
		super(x, y, id);
	}

	@Override
	public void tick(LinkedList<Object> object) {

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect((int) x, (int) y, 20, 40);
	}

}
