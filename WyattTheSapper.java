package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class WyattTheSapper extends Card {
	
	static Texture image = null;
	static String name = "Wayatt The Sapper";
	static int attackpoints = 1;
	static int defensepoints = 4;
	static int cost = 4;


	public WyattTheSapper() {
		super(image, name, cost, attackpoints, defensepoints);
	}
	
	
	

}
