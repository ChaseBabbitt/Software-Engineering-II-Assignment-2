package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class TyrannosaurusHex extends Card {
	public TyrannosaurusHex(){
		name = "Tyrannosaurus Hex";
		attackpoints = 6;
		defensepoints = 4;
		cost = 6;
		keywords = 0;
		image = new Texture("Cards/Tyrannosaurus Hex.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}

}
