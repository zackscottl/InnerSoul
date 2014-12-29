package tylerandzack.creations.innersoulgame.objects;

import java.awt.Graphics;
import java.util.LinkedList;

public abstract class Object {
	
	protected double x;
	protected double y;
	protected ObjectId id;
	
	public Object(double x, double y, ObjectId id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick(LinkedList<Object> object);
	
	public abstract void render(Graphics g);
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public ObjectId getId() {
		return this.id;
	}

}
