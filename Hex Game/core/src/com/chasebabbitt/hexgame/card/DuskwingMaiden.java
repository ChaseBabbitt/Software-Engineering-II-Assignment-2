package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class DuskwingMaiden extends Card {
	public DuskwingMaiden(){
		name = "Duskwing Maiden";
		attackpoints = 3;
		defensepoints = 2;
		cost = 4;
		keywords = 0;
		image = new Texture("Cards/Duskwing Maiden.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
