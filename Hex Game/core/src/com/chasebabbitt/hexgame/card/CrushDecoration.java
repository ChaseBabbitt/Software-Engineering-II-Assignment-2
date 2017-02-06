package com.chasebabbitt.hexgame.card;

public class CrushDecoration extends AbilitiesDecorator{
	CrushDecoration(Card card){
		super(card);
		keywords = Card.CRUSH;
		
	}
	
	public String toString(){
		return card.toString()+" Crush";
	}


}
