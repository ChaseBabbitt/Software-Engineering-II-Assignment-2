package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class Smashodon extends Card {
	public Smashodon(){
		name = "Smashodon";
		attackpoints = 5;
		defensepoints = 5;
		cost = 6;
		keywords = 0;
		image = new Texture("Cards/Smashodon.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
