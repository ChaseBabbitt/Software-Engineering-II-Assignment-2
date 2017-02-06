package com.chasebabbitt.hexgame.card;

public class SteadfastDecoration extends AbilitiesDecorator{
	SteadfastDecoration(Card card){
		super(card);
		keywords = Card.STEADFAST;
	}
	public String toString(){
		return card.toString()+" Steadfast";
	}

}
