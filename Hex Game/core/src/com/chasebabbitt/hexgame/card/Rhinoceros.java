package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class Rhinoceros extends Card {
	public Rhinoceros(){
		name = "Rhinocerous";
		attackpoints = 3;
		defensepoints = 3;
		cost = 3;
		keywords = 0;
		image = new Texture("Cards/Rhinoceros.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
