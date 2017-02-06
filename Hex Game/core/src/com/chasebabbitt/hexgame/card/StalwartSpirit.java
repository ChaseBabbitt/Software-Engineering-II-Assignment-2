package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class StalwartSpirit extends Card {
	public StalwartSpirit(){
		name = "Stalwart Spirit";
		attackpoints = 3;
		defensepoints = 3;
		cost = 4;
		keywords = 0;
		image = new Texture("Cards/Stalwart Spirit.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
