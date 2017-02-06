package com.chasebabbitt.hexgame.card;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
/*
 * Extends the libGDX Sprite class to make the Card class, allowing the card to be
 *  displayed on the screen as a sprite
 */
public abstract class Card extends Sprite{
	
	// Bit masks for card keywords
	public static final int FLY = 1;
	public static final int SKYGUARD = 2;
	public static final int CRUSH = 4;
	public static final int STEADFAST = 8;
	public static final int SWIFTSTRIKE = 16;
	public static final int DEATHTOUCH = 32;
	public static final int SPEED = 64;
	public static final int DEFENDER = 128;
	
	
	String name;
	int attackpoints;
	int defensepoints;
	int cost;
	int keywords;
	boolean tapped;
	boolean blocked;
	Texture image;
	Vector2 position;
	// Constructor for Card class for cards with no keywords
	/*public Card(Texture image, String name, int cost, int attackpoints, int defensepoints){
		this(image,name,cost,attackpoints,defensepoints,(short)0);
	}
	
	// Overloaded constructor for Card class that accepts a a short bitfield that represents keywords the card may have
	public Card(Texture image, String name, int cost, int attackpoints, int defensepoints, short keywords){
	
		//System.out.println("Creating card "+name+" with keywords "+keywords);
		this.name = name;
		this.defensepoints = defensepoints;
		this.attackpoints = attackpoints;
		this.cost = cost;
		this.image = image;
		this.keywords = keywords;
		tapped = false;
		
		setRegion(image);
		setBounds(0,0,160,222);
		setPosition(0,0);
		
		
	}*/
	public Card(){
		
	}
	//Getter method for attackpoints
	public int getAttackPoints(){
		return attackpoints;
	}
	
	//Getter method for defensepoints
	public int getDefensePoints(){
		return defensepoints;
	}
	
	//Getter method for cost;
	public int getCost(){
		return cost;
	}
	//Getter method for the name of the card
	public String getName(){
		return name;
	}
	public String toString(){
		String cardstats = new String();
		cardstats= name +" "+"("+attackpoints+","+defensepoints+")";
		return cardstats;
	}
	//Getter method for the keywords bitfield
	public int getKeywords(){
		return keywords;
	}
	/**
	 * getter method for specific keywords
	 * @param keyword keyword is a bitmask corresponding with the static keyword variables above
	 * @return as this this is an abstract of a base component, the base case will always return false,
	 *  as it has no keywords
	 */
	public boolean hasKeyword(int keyword){
		return false;
	}
	public boolean tappedStatus(){
		return tapped;
	}
	public void exhaust(){
		tapped = true;
	}
	public void untap(){
		tapped = false;
	}
	//Base case of a comes into play ability, does nothing
	public void comesIntoPlay(){} //
}
