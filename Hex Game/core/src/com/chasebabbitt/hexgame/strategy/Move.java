package com.chasebabbitt.hexgame.strategy;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface Move {

	public void execute();

	public void consoleDisplay();

	public void draw(SpriteBatch batch);
	
	
}
