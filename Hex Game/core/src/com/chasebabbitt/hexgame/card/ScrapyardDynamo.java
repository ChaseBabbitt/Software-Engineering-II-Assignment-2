package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class ScrapyardDynamo extends Card {
	public ScrapyardDynamo(){
		name = "Scrapyard Dynamo";
		attackpoints = 1;
		defensepoints = 1;
		cost = 1;
		keywords = 0;
		image = new Texture("Cards/Scrapyard Dynamo.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
