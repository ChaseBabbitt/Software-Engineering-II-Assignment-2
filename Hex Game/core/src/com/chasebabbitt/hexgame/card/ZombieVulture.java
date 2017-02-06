package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class ZombieVulture extends Card {
	public ZombieVulture(){
		name = "Zombie Vulture";
		attackpoints = 4;
		defensepoints = 1;
		cost = 5;
		keywords = 0;
		image = new Texture("Cards/Zombie Vulture.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
