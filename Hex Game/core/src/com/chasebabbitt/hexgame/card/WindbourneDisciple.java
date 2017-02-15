package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class WindbourneDisciple extends Card {
	public WindbourneDisciple(){
		name = "Windbourne Disciple";
		attackpoints = 2;
		defensepoints = 3;
		cost = 3;
		keywords = 0; //fly
		image = new Texture("Cards/Windbourne Disciple.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
