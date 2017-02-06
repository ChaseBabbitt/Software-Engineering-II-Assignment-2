package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class RigidBuffalo extends Card {
	public RigidBuffalo(){
		name = "Rigid Buffalo";
		attackpoints = 2;
		defensepoints = 3;
		cost = 2;
		keywords = 0;
		image = new Texture("Cards/Rigid Buffalo.jpg");
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
	}
}
