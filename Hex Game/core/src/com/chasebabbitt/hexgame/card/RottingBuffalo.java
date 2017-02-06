package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class RottingBuffalo extends Card {
	public RottingBuffalo(){
		name = "Rotting Buffalo";
		attackpoints = 2;
		defensepoints = 3;
		cost = 3;
		keywords = 0;
		image = new Texture("Cards/Rotting Buffalo.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
