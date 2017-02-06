package com.chasebabbitt.hexgame.zones;

import com.badlogic.gdx.utils.Array;
import com.chasebabbitt.hexgame.card.Card;

public class Graveyard {
	Array<Card> graveyard;
	public Graveyard(){
		graveyard = new Array<Card>();
	}
	public void add(Card card){
		graveyard.add(card);
	}

}
