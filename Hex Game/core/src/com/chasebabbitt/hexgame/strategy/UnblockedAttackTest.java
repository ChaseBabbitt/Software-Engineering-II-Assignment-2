package com.chasebabbitt.hexgame.strategy;


import org.junit.Before;
import org.junit.Test;

import com.chasebabbitt.hexgame.actors.Player;
import com.chasebabbitt.hexgame.card.Card;
import com.chasebabbitt.hexgame.card.CardGenerator;

public class UnblockedAttackTest {
	
	Player attackingplayer,defendingplayer;
	Move unblockedattack;
	Card attackingcard;
	CardGenerator generator;


	@Before
	public void setUp() {
		generator = new CardGenerator();
		attackingplayer = new Player(20,"Player 1",defendingplayer);
		defendingplayer = new Player(20,"Player 2",attackingplayer);
		attackingcard = generator.getCard(0);
		unblockedattack = new UnblockedAttack(attackingcard,attackingplayer,defendingplayer);
		//unblockedattack.execute();
		//assert(defendingplayer.getPlayerHealth()==14);
		//fail("Not yet implemented")
	}
	
	@Test
	public void test(){
		//unblockedattack.execute();
		//assertEquals(defendingplayer.getPlayerHealth(),14);
		
	}

}
