package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class Zombie extends Card {
	public Zombie(){
		name = "Zombie";
		attackpoints = 2;
		defensepoints = 2;
		cost = 2;
		keywords = 0;
		image = new Texture("Cards/Zombie.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
