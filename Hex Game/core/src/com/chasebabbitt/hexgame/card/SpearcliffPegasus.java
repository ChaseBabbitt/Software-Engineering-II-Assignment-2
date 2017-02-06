package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class SpearcliffPegasus extends Card {
	public SpearcliffPegasus(){
		name = "Spearcliff Pegasus";
		attackpoints = 2;
		defensepoints = 1;
		cost = 2;
		keywords = 0;
		image = new Texture("Cards/Spearcliff Pegasus.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
