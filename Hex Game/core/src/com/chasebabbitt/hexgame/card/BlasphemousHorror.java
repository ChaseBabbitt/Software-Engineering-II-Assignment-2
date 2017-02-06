package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class BlasphemousHorror extends Card{

	public BlasphemousHorror() {
		name = "Blasphemous Horror";
		attackpoints = 6;
		defensepoints = 6;
		cost = 6;
		keywords = 0;
		image = new Texture("Cards/Blasphemous Horror.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
