package com.INF1009.Lab;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Enemies extends TextureObject{
	public Enemies() {
		super();
	}
	
	public Enemies(String textureFile) {
		super("droplet.png");
	}
	
	public Enemies(String textureFile, float x, float y, float speed) {
		super("droplet.png", x, y, speed);
	}
	
	public void moveAIcontrolled() {
	    // Move object left or right
	    this.setX(this.getX() + this.getSpeed());

	    // Bounce when hitting left or right edges
	    if (this.getX() <= 0 || this.getX() >= 580) {
	        this.setSpeed(-this.getSpeed()); // Reverse direction
	    }

	    // Reset Y position if condition is met (kept from your original code)
	    if (this.getY() < 0 && this.getSpeed() <= 10) {
	        this.setY(400);
	    }
	}
}