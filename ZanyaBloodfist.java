package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;

public class ZanyaBloodfist extends Card{
	
	static Texture image = null;
	static String name = "Zanya Bloodfist";
	static int attackpoints = 1;
	static int defensepoints = 4;
	static int cost = 4;

	public ZanyaBloodfist() {
		super(image, name, cost, attackpoints, defensepoints);
		// TODO Auto-generated constructor stub
	}

}
