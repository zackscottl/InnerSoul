package tylerandzack.creations.innersoulgame;

public class Map {

	String name;
	int width;
	int height;

	public Map(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public void render() {
		switch (name) {
		case "start":
			//render starting map
			break;
		default:
			break;
		}
	}

	public String getName() {
		return this.name;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

}
