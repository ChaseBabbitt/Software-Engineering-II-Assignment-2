package com.chasebabbitt.hexgame.strategy;

import com.badlogic.gdx.utils.Array;
import com.chasebabbitt.hexgame.actors.Player;
import com.chasebabbitt.hexgame.card.Card;

public class DumbStrategy implements Strategy {

	@Override
	/** Naive strategy that returns the first legal defense choice it can find, this may return null
	 *  if no legal defense can be made(there is no attacking card)
	 * @param an object of type HexGame
	 * @return returns a Move object that represents a suggested defense move
	 */
	public Move getMove(Player defender, Player attacker) {
		// TODO Auto-generated method stub
		Card defendingcard=null;
		Card attackingcard=null;
		
		System.out.println("Dumb Strategy Method called.");
		Move move = null;
		
		//An array of cards that represents all the attacking cards the opponent controls
		Array<Card> attackingcards = attacker.getCards();
		//An Array of cards that that defending player controls
		Array<Card> defendingcards = defender.getCards();
		//An Array of cards that represents a legal defending move
		Array<Card> legalblockingcards = new Array<Card>();
		
		if(attackingcards.size>0){
			attackingcard = attackingcards.first();
			attacker.removeAttackingCard(attackingcard);
		}
		//If there are no attacking cards, return a null move
		if(attackingcard == null)
			return move;
		
		if((attackingcard.getKeywords()&Card.FLY)==Card.FLY){
			System.out.println(attackingcard.getName()+" has flying.");
			short legalblocker = Card.FLY | Card.SKYGUARD;
			for(Card c:defendingcards){		
				if ((c.getKeywords() & legalblocker) > 0){
					System.out.println(c.getName()+" is a legal blocker");
					legalblockingcards.add(c);
				}
			}	
		}
		else{
			legalblockingcards.addAll(defendingcards);
		}
		
		if(legalblockingcards.size>0){
			defendingcard = legalblockingcards.first();
			defender.removeDefendingCard(defendingcard);
			move = new BlockedAttack(attackingcard,defendingcard,attacker,defender);
		}
		else{
			move = new UnblockedAttack(attackingcard,attacker,defender);
		}
		return move;
	}

}
