package com.INF1009.Lab;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.ArrayList;
import java.util.List;

public class EntityManager {
	private List<Entity> entityList;
	
	private SpriteBatch batch = new SpriteBatch();
	
	public EntityManager() {
		this.entityList = new ArrayList<>();
	}
	
	public void add(Entity entity) {
		this.entityList.add(entity);
	}
	
	public void remove(int index) {
		this.entityList.remove(index);
	}
	
	public Entity get(int index) {
		return this.entityList.get(index);
	}
	
	public void draw(SpriteBatch batch) {
		for (Entity entity : entityList) {
            entity.draw(batch);
        }
	}
	
	public void draw(ShapeRenderer shape) {
		for (Entity entity : entityList) {
            entity.draw(shape);
        }
	}
	
	public void movement() {
		for (Entity entity : entityList) {
            entity.movement();
        }
	}
	
	public void update() {
		for (Entity entity : entityList) {
            entity.update();
        }
	}
}