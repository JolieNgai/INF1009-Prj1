package com.INF1009.Lab;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import java.util.Random;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;

public class GameMaster extends ApplicationAdapter{
	private SpriteBatch batch;
	private ShapeRenderer shape;
	
	private Entity enemies;
	private Entity player;	
	private Entity bullet;
	
	private EntityManager em;
	
	@Override
	public void create() {
		// Screen size: (1920, 1080)
		batch = new SpriteBatch();
		
		player = new Player("bucket.png",420,0,15);
		
		enemies = new Enemies("droplet.png", 420, 400, 10);
		
		shape = new ShapeRenderer();
		
		bullet = new Bullet(Color.RED,10,player.getX(),player.getY(),15);
		
//		Random random = new Random();
		
//		for (int i = 0; i < 10; i++) {
//			float randomX = random.nextFloat(Gdx.graphics.getWidth());
//			float randomY = random.nextFloat(Gdx.graphics.getHeight());
//          enemies = new Enemies("droplet.png", randomX, randomY, 15);
//		}
	
		em = new EntityManager();
		
		em.add(enemies);
		em.add(player);
	}

	@Override
	public void render(){
		ScreenUtils.clear(0,0,0.2f,1);

		batch.begin();
			em.draw(batch);
			
		batch.end();

		shape.begin(ShapeRenderer.ShapeType.Filled);		
			em.draw(shape);
			if(Gdx.input.isKeyPressed(Keys.SPACE)){
				bullet = new Bullet(Color.RED,10,player.getX(),player.getY(),15);
				em.add(bullet);
				bullet.draw(shape);
				
			}
		shape.end();
		
		enemies.moveAIcontrolled();
		player.moveUserControlled();
		bullet.moveAIcontrolled();
		em.update();
	
	}
	
	public void dispose(){
		batch.dispose();
		shape.dispose();
	}
}