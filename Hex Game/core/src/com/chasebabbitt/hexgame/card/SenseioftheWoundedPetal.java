package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class SenseioftheWoundedPetal extends Card {
	public SenseioftheWoundedPetal(){
		name = "Sensei of the Wounded Petal";
		attackpoints = 3;
		defensepoints = 3;
		cost = 4;
		keywords = 0; 
		image = new Texture("Cards/Sensei of the Wounded Petal.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
