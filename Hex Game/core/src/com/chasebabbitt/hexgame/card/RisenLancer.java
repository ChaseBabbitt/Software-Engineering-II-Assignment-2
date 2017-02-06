package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class RisenLancer extends Card {
	public RisenLancer(){
		name = "Risen Lancer";
		attackpoints = 3;
		defensepoints = 1;
		cost = 2;
		keywords = 0;
		image = new Texture("Cards/Risen Lancer.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
