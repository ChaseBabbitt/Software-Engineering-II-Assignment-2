package com.chasebabbitt.hexgame.zones;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.chasebabbitt.hexgame.card.Card;
import com.chasebabbitt.hexgame.card.CardGenerator;

public class PlayerField {
	CardGenerator generator;
	Array<Card> playercards;
	public PlayerField(){
		generator = new CardGenerator();
		playercards = new Array<Card>();
		
	}
	public void addCard(){
		Card newcard;
		newcard = generator.getCard();
		playercards.add(newcard);
	}
	public void addCard(int cardindex){
		Card newcard;
		newcard = generator.getCard(cardindex);
		playercards.add(newcard);
	}
	
	public void draw(SpriteBatch batch, int x, int y){
		for(Card c:playercards){
			c.setPosition(playercards.indexOf(c,true)*170+x,0+y);
			c.draw(batch);
		}
	}
	
	public Array<Card> getCards(){
		return playercards;
	}
	
	public void getAttackers(Array<Card> attackers){
		for(Card c:playercards)
			attackers.add(c);
	}
	
	public void removeCard(Card card){
		playercards.removeValue(card,true);
	}
	public int size(){
		return playercards.size;
	}
	
	public void discard(){
		playercards = new Array<Card>();
	}
	public void toConsole(){
		for(Card c:playercards){
			System.out.println(c.getName());
		}
	}
}


