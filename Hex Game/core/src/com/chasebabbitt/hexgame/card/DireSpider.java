package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class DireSpider extends Card{

	public DireSpider() {
		name = "Dire Spider";
		attackpoints = 3;
		defensepoints = 1;
		cost = 2;
		keywords = 0;
		image = new Texture("Cards/Dire Spider.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
