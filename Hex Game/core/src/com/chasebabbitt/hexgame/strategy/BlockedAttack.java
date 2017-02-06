package com.chasebabbitt.hexgame.strategy;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.chasebabbitt.hexgame.actors.Player;
import com.chasebabbitt.hexgame.card.Card;
/**
 * A Move object
 * @author Chase
 *
 */
public class BlockedAttack implements Move{
	/**
	 * attacker is the attacking card and defender is the defending card, the defending card may be full to represent
	 * not defending an attack when it would be unwise to do so
	 */
	Player attackingplayer, defendingplayer;
	Card attackingcard, defendingcard;
	
	public BlockedAttack(Card attacker, Card defender, Player attackingplayer, Player defendingplayer){
		this.attackingcard=attacker;
		this.defendingcard=defender;
		this.attackingplayer = attackingplayer;
		this.defendingplayer = defendingplayer;
	}
	
	/**
	 * Draws a graphical representation of the move to right side of the screen
	 * @param batch an object of type SpriteBatch
	 */
	public void draw(SpriteBatch batch){
		//attackingcard.setBounds(0, 0, 214,297);
		attackingcard.setPosition(900, 420);
		attackingcard.draw(batch);
		if(defendingcard!=null){
			
			//defendingcard.setBounds(0,0,214,297);
			defendingcard.setPosition(900, 10);
			defendingcard.draw(batch);
		}
	}
	/**
	 * Displays the move for the console
	 */
	public void consoleDisplay(){
		if(defendingcard==null){
			System.out.println(attackingcard.getName()+" attacks and is not blocked");
		}
		else{
			System.out.println(attackingcard.getName()+" attacks and is blocked by "+defendingcard.getName());
		}
	}

	@Override
	public void execute() {
		System.out.println(attackingcard.getName()+" attacks and is blocked by "+defendingcard.getName());
		if(attackingcard.getAttackPoints()>=defendingcard.getDefensePoints()){
			System.out.println(attackingcard.getName()+" defeats "+ defendingcard.getName());
			//Do methods to kill defending card
			defendingplayer.moveCardToGraveyard(defendingcard);
			//If attacker has crush, do methods do deal damage to defending player equal to attackingcard attack - defendincard defense
			if(((attackingcard.getKeywords()&Card.CRUSH)==Card.CRUSH)&&(attackingcard.getAttackPoints()>defendingcard.getDefensePoints()))
				defendingplayer.dealDamage(attackingcard.getAttackPoints()-defendingcard.getDefensePoints());
		}
		if(defendingcard.getAttackPoints()>=attackingcard.getDefensePoints()){
			System.out.println(defendingcard.getName()+" defeats "+ attackingcard.getName());
			//Do methods to kill attacking card
			attackingplayer.moveCardToGraveyard(attackingcard);
		}
		
	}
}
