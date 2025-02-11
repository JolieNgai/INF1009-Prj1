package com.INF1009.Lab;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class TextureObject extends Entity{
	private Texture tex;
	
	TextureObject() {
		super();
	}
	
	TextureObject(String textureFile, float x, float y, float speed) {
		super(x, y, speed);
		tex = new Texture(textureFile);
	}
	
	public TextureObject(String textureFile) {
		tex = new Texture(textureFile);
	}
	
	public void draw(SpriteBatch batch) {
		batch.draw(this.tex, this.getX(), this.getY());
	}
	
	public void update() {
		System.out.println("In textureObject of " + tex.toString() + " at " + this.getX() + ", " + this.getY() + " position");
	}
	
	public void dispose(){
		tex.dispose();
	}
	
	public void moveUserControlled() {

	}
	
	public void moveAIcontrolled() {
		
	}
	
}