package com.chasebabbitt.hexgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HexGame extends Game {

	SpriteBatch batch;

	
	HexDuel duel;
	
	@Override
	public void create () {
	
		batch = new SpriteBatch();
		duel = new HexDuel();
		duel.start();
	}

	@Override
	/**
	 * render method for the game
	 */
	public void render () {
		
		if(Gdx.input.isKeyJustPressed(Input.Keys.A)){
			duel.suggestMove();
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.Q)){
			duel.TestCase1();
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.W)){
			duel.TestCase2();
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.R)){
			duel.RandomCase();
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.D)){
			duel.setPlayer2DumbStrategy();
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.S)){
			duel.setPlayer2DefenseStrategy();
		}
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		duel.draw(batch);
		batch.end();
	}
}
