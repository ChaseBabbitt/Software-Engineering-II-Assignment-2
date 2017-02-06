package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class Llama extends Card {
	public Llama(){
		name = "Llama";
		attackpoints = 2;
		defensepoints = 2;
		cost = 2;
		keywords = 0;
		image = new Texture("Cards/Llama.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
