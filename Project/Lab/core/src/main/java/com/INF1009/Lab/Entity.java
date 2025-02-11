package com.INF1009.Lab;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Entity implements iMovable{
	protected float x, y, speed;
	
	public Entity() {
		this.x = 0;
        this.y = 0;
        this.speed = 0;
	}
	
	public Entity(float x, float y, float speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
	}
	
	public void setX(float setX) {
		x = setX;
	}
	
	public float getX() {
		return x;
	}
	
	public void setY(float setY) {
		y = setY;
	}
	
	public float getY() {
		return y;
	}
	
	public void setSpeed(float setSpeed) {
		speed = setSpeed;
	}
	
	public float getSpeed() {
		return speed;
	}
	
	public void draw(ShapeRenderer shape) {
		
	}
	
	public void draw(SpriteBatch batch) {
		
	}

	public void movement() {
		if(Gdx.input.isKeyPressed(Keys.LEFT)){
			this.setX(this.getX() - this.speed * Gdx.graphics.getDeltaTime());
		}
		
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			this.setX(this.getX() + this.speed * Gdx.graphics.getDeltaTime());
		}
		
		if(this.getX() < 0) {
			this.setX(0);
		}
		
		else if(this.getX() > 580) {
			this.setX(580);
		}
	}
	
	abstract public void update();
	
}
