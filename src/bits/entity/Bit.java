package bits.entity;

import bits.component.*;

import bits.geometry.Vector2D;

public class Bit extends Entity {
	private SteerComponent steerComponent;

	public Bit(float x, float y, float width, float height) {
		super(x, y, width, height);
		
		steerComponent = new SteerComponent(this);
	}
	
	public final Vector2D getHeading() {
		return steerComponent.getHeading();
	}
	
	public final void update(int dt) {
		if (dt == 0) return;
		steerComponent.update(dt);
	}
}
