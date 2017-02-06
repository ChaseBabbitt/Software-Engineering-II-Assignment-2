package com.chasebabbitt.hexgame.actors;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.chasebabbitt.hexgame.card.Card;
import com.chasebabbitt.hexgame.strategy.DefenseStrategy;
import com.chasebabbitt.hexgame.strategy.DumbStrategy;
import com.chasebabbitt.hexgame.strategy.Move;
import com.chasebabbitt.hexgame.strategy.Strategy;
import com.chasebabbitt.hexgame.zones.Deck;
import com.chasebabbitt.hexgame.zones.Graveyard;
import com.chasebabbitt.hexgame.zones.Hand;
import com.chasebabbitt.hexgame.zones.PlayerField;

public class Player {
	// The player's name
	String name;
	// The player's health
	int health;
	// A reference to the opposing player
	Player opponent;
	// The player's hand
	Hand hand;
	// The player's field, all the cards the player has in play
	PlayerField field;
	// The player's deck, from which new cards are drawn
	Deck deck;
	// The player's graveyard, where cards go after they've been used or defeated
	Graveyard graveyard;
	// The player's strategy
	Strategy strategy;
	
	Array<Card> defendingcards;
	
	Array<Card> attackingcards;
	
	/**
	 * Constructor for Player
	 * @param health the integer value that the player's health will be
	 * @param name the name of the Player
	 * @param opponent, a reference to the opposing Player
	 */
	public Player(int health, String name, Player opponent){
		this.health = health;
		this.opponent = opponent;
		this.name = name;
		hand = new Hand();
		field = new PlayerField();
		deck = new Deck();
		graveyard = new Graveyard();
		strategy = new DefenseStrategy();
		
		defendingcards = new Array<Card>();
		attackingcards = new Array<Card>();
		
	}
	
	/**
	 * Getter method for Player's health
	 * @return returns the value of health
	 */
	public int getPlayerHealth(){
		return health;
	}
	
	/**
	 * Getter method for Player's name
	 * @return returns the name of the player
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Setter method for Player's health
	 */
	public void setPlayerHealth(int health){
		this.health = health;		
	}
	

	/**
	 * Method for dealing damage to the player's health
	 * @param damage the damage to be done to the player's health
	 */
	public void dealDamage(int damage){
		health = health - damage;
		System.out.println(name+" was dealt "+ damage+" damage.");
		
	}
	/**
	 * Method for using the strategy 
	 * @return an object of type Move
	 */
	public Move getMove(){
		return strategy.getMove(this, opponent);
	}
	
	//Returns an array of the Cards in the Player's field
	public Array<Card> getCards(){
		return field.getCards();
	}
	
	//Copies the array of cards in the Player's field to a temporary array of attacking cards
	public void setAttackingCards(){
		attackingcards.clear();
		attackingcards.addAll(getCards());
		//field.getAttackers(attackingcards);
		//attackingcards = field.getCards();
		
	}
	public void moveCardToGraveyard(Card card){
		field.removeCard(card);
		graveyard.add(card);
	}
	
	//Getter for the attackingcards array
	public Array<Card> getAttackingCards(){
		return attackingcards;
	}
	
	//Removes the passed card for the array of attackers
	public void removeAttackingCard(Card card){
		attackingcards.removeValue(card, true);		
	}
	
	//Copies the array of cards in the Player's field to a temporary array of defending cards
	public void setDefendingCards(){
		defendingcards.clear();
		defendingcards.addAll(getCards());
		//defendingcards = field.getCards();		
	}
	
	//Getter for the defendingcards array
	public Array<Card> getDefendingCards(){
		return defendingcards;
	}
	
	//Removes the passed card from the array of defenders
	public void removeDefendingCard(Card card){
		defendingcards.removeValue(card, true);
	}
	public void setTestCase1A() {
		field.discard();
		field.addCard(2);
		field.addCard(21);
		setAttackingCards();
		
	}
	public void setTestCase1D() {
		field.discard();
		field.addCard(3);
		field.addCard(9);
		setDefendingCards();
		//defendingcards = getCards();
	}
	public void setTestCase2A() {
		field.discard();
		field.addCard(16);
		setAttackingCards();
	}
	public void setTestCase2D(){
		field.discard();
		setPlayerHealth(1);
		field.addCard(20);
		setDefendingCards();
		//defendingcards = getCards();
	}
	public void setRandomCaseA(){
		field.discard();
		setPlayerHealth(20);
		field.addCard();
		field.addCard();
		field.addCard();
		field.addCard();
		setAttackingCards();
	}
	public void setRandomCaseD(){
		field.discard();
		setPlayerHealth(20);
		field.addCard();
		field.addCard();
		field.addCard();
		field.addCard();
		setDefendingCards();
		/*defendingcards.clear();
		defendingcards.addAll(getCards());// = getCards();*/
	}
	// Method for rendering the player's field to the screen
	public void draw(SpriteBatch batch,int x, int y){
		field.draw(batch, x, y);		
	}
	
	public void setDumbStrategy(){
		strategy = new DumbStrategy();
	}
	public void setDefenseStrategy(){
		strategy = new DefenseStrategy();
	}
	public void toConsole(){
		System.out.println("\n");
		System.out.println(name+"'s Field:             Health: "+health);
		field.toConsole();
	}
}
