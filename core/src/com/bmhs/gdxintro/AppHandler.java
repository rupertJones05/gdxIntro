package com.bmhs.gdxintro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.gdxintro.gfx.utils.TileHandler;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;
	Texture subimg;
	TextureRegion subImg;
	int x, y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		//subimg = new Texture("primaryColorSheet.png");
		//subImg = new TextureRegion(subimg, 64, 0, 128, 128);
		x = 0;
		y = 0;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		for(int r = 0; r < Gdx.graphics.getHeight(); r+=64) {
			for(int c = 0; c < Gdx.graphics.getWidth(); c+=64) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(x++).getTexture(), c, r);
				if (x > 7) {
					x = 0;
				}
			}
		}

		batch.end();

		//checkInput();
	}

	public void checkInput() {

//		if (Gdx.input.isKeyPressed(Input.Keys.W)) {
//			y += 10;
//		}
//		if (Gdx.input.isKeyPressed(Input.Keys.A)) {
//			x -= 10;
//		}
//		if (Gdx.input.isKeyPressed(Input.Keys.S)) {
//			y -= 10;
//		}
//		if (Gdx.input.isKeyPressed(Input.Keys.D)) {
//			x += 10;
//		}
//
//		System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());
//
//
//		x = Gdx.input.getX() - subimg.getWidth()/2;
//		y = Gdx.graphics.getHeight() - Gdx.input.getY() - subimg.getHeight()/2;



		/*
		if(x < (Gdx.input.getX() - subimg.getWidth()/2)) {
			x += 5;
		}
		if(x > (Gdx.input.getX() - subimg.getWidth()/2)) {
			x -= 5;
		}
		if(y > (Gdx.graphics.getHeight() - Gdx.input.getY() - subimg.getHeight()/2)) {
			y -= 5;
		}
		if(y < (Gdx.graphics.getHeight() - Gdx.input.getY() - subimg.getHeight()/2)) {
			y += 5;
		}

		 */

	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
