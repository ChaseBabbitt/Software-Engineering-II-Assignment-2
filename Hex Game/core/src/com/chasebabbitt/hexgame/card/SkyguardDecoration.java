package com.chasebabbitt.hexgame.card;

public class SkyguardDecoration extends AbilitiesDecorator {
	SkyguardDecoration(Card card){
		super(card);
		keywords = Card.SKYGUARD;
		
	}
	
	public String toString(){
		return card.toString()+" Skyguard";
	}

}
