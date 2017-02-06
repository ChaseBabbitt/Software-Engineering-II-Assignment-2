package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class TrottingBuffalo extends Card {
	public TrottingBuffalo(){
		name = "Trotting Buffalo";
		attackpoints = 2;
		defensepoints = 3;
		cost = 2;
		keywords = 0;
		image = new Texture("Cards/Trotting Buffalo.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
