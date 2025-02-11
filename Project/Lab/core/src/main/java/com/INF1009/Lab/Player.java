package com.INF1009.Lab;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Player extends TextureObject{
	public Player() {
		super();
	}
	
	public Player(String textureFile) {
		super("bucket.png");
	}
	
	public Player(String textureFile, float x, float y, float speed) {
		super("bucket.png", x, y, speed);
	}
	
	public void moveUserControlled() {
		if(Gdx.input.isKeyPressed(Keys.LEFT) && this.getX() > 0){
			this.setX(this.getX() - this.getSpeed());
		}
		
		if(Gdx.input.isKeyPressed(Keys.RIGHT) && this.getX() < 580) {
			this.setX(this.getX() + this.getSpeed());
		}
	}
}
