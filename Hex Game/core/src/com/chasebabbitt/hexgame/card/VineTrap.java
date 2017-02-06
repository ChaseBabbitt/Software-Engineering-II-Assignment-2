package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class VineTrap extends Card {
	public VineTrap(){
		name = "Vine Trap";
		attackpoints = 2;
		defensepoints = 4;
		cost = 3;
		keywords = 0;
		image = new Texture("Cards/Vine Trap.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
