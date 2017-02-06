package com.chasebabbitt.hexgame.strategy;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.chasebabbitt.hexgame.actors.Player;
import com.chasebabbitt.hexgame.card.Card;

public class UnblockedAttack implements Move {
	
	Card attackingcard;
	Player attackingplayer, defendingplayer;
	
	public UnblockedAttack(Card attackingcard, Player attackingplayer, Player defendingplayer){
		this.attackingcard = attackingcard;
		this.attackingplayer = attackingplayer;
		this.defendingplayer = defendingplayer;
	}

	@Override
	public void execute() {
		System.out.println(attackingcard.getName()+" attacks and is not blocked!");
		defendingplayer.dealDamage(attackingcard.getAttackPoints());
		
	}

	public void draw(SpriteBatch batch){
		//attackingcard.setBounds(0, 0, 214,297);
		attackingcard.setPosition(900, 420);
		attackingcard.draw(batch);
		
	}
	/**
	 * Displays the move for the console
	 */
	public void consoleDisplay(){
			System.out.println(attackingcard.getName()+" attacks and is not blocked");
	}	


}
