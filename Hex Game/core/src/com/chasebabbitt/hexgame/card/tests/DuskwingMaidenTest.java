package com.chasebabbitt.hexgame.card.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.chasebabbitt.hexgame.card.Card;
import com.chasebabbitt.hexgame.card.CardGenerator;

public class DuskwingMaidenTest {

	CardGenerator generator;
	Card card;
	@Before
	public void setUp(){
		card = generator.getCard(2);
	}
	@Test
	public void test() {
		assertEquals(card.getKeywords(),Card.FLY);
		//fail("Not yet implemented");
	}

}
