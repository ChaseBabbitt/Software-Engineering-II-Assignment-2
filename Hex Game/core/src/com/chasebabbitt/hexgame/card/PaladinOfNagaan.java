package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class PaladinOfNagaan extends Card {
	public PaladinOfNagaan(){
		name = "Paladin of Nagaan";
		attackpoints = 3;
		defensepoints = 5;
		cost = 5;
		keywords = 0;
		image = new Texture("Cards/Paladin of Naagaan.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
