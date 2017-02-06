package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class RotrootEnchanter extends Card {
	public RotrootEnchanter(){
		name = "Rotroot Enchanter";
		attackpoints = 3;
		defensepoints = 5;
		cost = 5;
		keywords = 0;
		image = new Texture("Cards/Rotroot Enchanter.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
