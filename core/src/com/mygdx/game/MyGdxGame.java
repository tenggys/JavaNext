package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;


public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, img2;
	TextureAtlas atlas;
	ArrayList<Hero> darkSide, whiteSide;
	static final int SCALE = 60;
	BitmapFont font;

	@Override
	public void create() {

		font = new BitmapFont();
		font.setColor(Color.SKY);
		font.getData().setScale(1.25f, 1);

		batch = new SpriteBatch();
		img = new Texture("CmBkDes.png");
		img2 = new Texture("badlogic.jpg");
		atlas = new TextureAtlas("atlas/unnamed.atlas");

		whiteSide = new ArrayList<>();
		darkSide = new ArrayList<>();

		int x=1;
		for (int i = 0; i < 10; i++) {
			whiteSide.add(new Hero(x, 1, atlas));
			darkSide.add(new Hero(x++, 10, atlas));
		}
	}

	@Override
	public void render() {
		ScreenUtils.clear(1, 0, 0, 1);

		float mx = Gdx.input.getX();
		float my = Gdx.graphics.getHeight() - Gdx.input.getY();

		if (Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY) || Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {

		}

		batch.begin();
		batch.draw(img, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

//		batch.draw(img2, mx, my);

		for (Hero hero: darkSide) {
			hero.update(Gdx.graphics.getDeltaTime());
			batch.draw(hero.getFamre(), hero.position.x*SCALE, hero.position.y*SCALE);
		}
		for (Hero hero: whiteSide) {
			hero.update(Gdx.graphics.getDeltaTime());
			batch.draw(hero.getFamre(), hero.position.x*SCALE, hero.position.y*SCALE);
		}

		font.draw(batch, "Hello World!", Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
