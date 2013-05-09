package bits.entity;

import bits.geometry.Vector2D;
import bits.util.IntGenerator;

public abstract class Entity {
	private Vector2D position;

	private float width;
	private float height;
	private final int id = intGenerator.nextInt();
	
	private static final IntGenerator intGenerator  = new IntGenerator();
	
	protected Entity(float x, float y, float width, float height) {
		position = new Vector2D(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getId() {
		return id;
	}
	
	public Vector2D getPosition() {
		return position;
	}

	public void setPosition(final Vector2D position) {
		this.position = position.copy();
	}
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
