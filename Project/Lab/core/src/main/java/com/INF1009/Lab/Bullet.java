package com.INF1009.Lab;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;

public class Bullet extends Entity{
	private Color color;
	private float radius;
	
	public Bullet() {
		super();
		radius = 10;
		color = color.WHITE;
	}
	
	public Bullet(Color color, float radius, float x, float y, float speed) {
		super(x, y, speed);
		this.radius = radius;
		this.color = color;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float getRadius() {
		return radius;
	}
	
	@Override
	public void draw(ShapeRenderer shape) {
		shape.setColor(this.color);
		shape.circle(this.getX(), this.getY(), this.radius);
	}
	
	public void update() {
		System.out.println("In circle of radius " + this.radius + " at " + this.getX() + ", " + this.getY() + " position");
	}
	
	public void moveAIcontrolled() {
		this.setY(this.getY() + this.getSpeed());
	}
	
	public void moveUserControlled() {
		//Empty
	}
}
