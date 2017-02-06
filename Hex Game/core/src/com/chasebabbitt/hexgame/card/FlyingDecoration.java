package com.chasebabbitt.hexgame.card;

public class FlyingDecoration extends AbilitiesDecorator{
	
	FlyingDecoration(Card card) {
		super(card);
		keywords = Card.FLY;
	}

	public String toString(){
		return card.toString()+" Flying";
	}

}
