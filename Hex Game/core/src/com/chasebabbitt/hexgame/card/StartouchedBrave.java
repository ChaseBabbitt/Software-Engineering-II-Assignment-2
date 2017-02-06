package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class StartouchedBrave extends Card {
	public StartouchedBrave(){
		name = "Startouched Brave";
		attackpoints = 0;
		defensepoints = 7;
		cost = 4;
		keywords = 0;
		image = new Texture("Cards/Startouched Brave.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
