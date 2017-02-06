package com.chasebabbitt.hexgame.zones;

import com.badlogic.gdx.utils.Array;
import com.chasebabbitt.hexgame.card.Card;
import com.chasebabbitt.hexgame.card.CardGenerator;

public class Deck {
	Array<Card> deck;
	CardGenerator generator;
	public Deck(){
		deck = new Array<Card>();
		generator = new CardGenerator();
		for(int i = 1;i<60;i++){
			deck.add(generator.getCard());			
		}
			
	}
	
	public Card draw(){
		return deck.removeIndex(0);
	}
}
