package com.chasebabbitt.hexgame.card;

import java.util.Random;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public final class CardGenerator {
	static AssetManager manager;
	public CardGenerator(){
		manager = new AssetManager();
		manager.load("Cards/Blasphemous Horror.jpg", Texture.class);
		manager.load("Cards/Dire Spider.jpg", Texture.class);
		manager.load("Cards/Duskwing Maiden.jpg", Texture.class);
		manager.load("Cards/Llama.jpg", Texture.class);
		manager.load("Cards/Paladin of Naagaan.jpg", Texture.class);
		manager.load("Cards/Phantom.jpg", Texture.class);
		manager.load("Cards/Rhinoceros.jpg", Texture.class);
		manager.load("Cards/Rigid Buffalo.jpg", Texture.class);
		manager.load("Cards/Risen Lancer.jpg", Texture.class);
		manager.load("Cards/Rotroot Enchanter.jpg", Texture.class);
		manager.load("Cards/Rotting Buffalo.jpg", Texture.class);
		manager.load("Cards/Smashodon.jpg", Texture.class);
		manager.load("Cards/Spearcliff Pegasus.jpg", Texture.class);
		manager.load("Cards/Stalwart Spirit.jpg", Texture.class);
		manager.load("Cards/Startouched Brave.jpg", Texture.class);
		manager.load("Cards/Sterling Skywatcher.jpg", Texture.class);
		manager.load("Cards/Trotting Buffalo.jpg", Texture.class);
		manager.load("Cards/Tyrannosaurus Hex.jpg", Texture.class);
		manager.load("Cards/Vine Trap.jpg", Texture.class);
		manager.load("Cards/Wild Child.jpg", Texture.class);
		manager.load("Cards/Zombie Vulture.jpg", Texture.class);
		manager.load("Cards/Zombie.jpg", Texture.class);
		manager.finishLoading();
		
	}
	public Card getCard(){
		Random rand = new Random();
		int randomcard = rand.nextInt(22);
		return getCard(randomcard);
		
	}
	public Card getCard(int cardindex){
		Card card = null;
		
		switch(cardindex){
		case 0:
			card = new Card(manager.get("Cards/Blasphemous Horror.jpg", Texture.class),"Blasphemouse Horror",6,6,6);
			break;
		case 1:
			card = new Card(manager.get("Cards/Dire Spider.jpg", Texture.class),"Dire Spider",2,3,1);
			break;
		case 2:
			card = new Card(manager.get("Cards/Duskwing Maiden.jpg", Texture.class),"Duskwing Maiden",4,3,2,Card.FLY);
			break;
		case 3:
			card = new Card(manager.get("Cards/Llama.jpg", Texture.class),"Llama",2,2,2);
			break;
		case 4:
			card = new Card(manager.get("Cards/Paladin of Naagaan.jpg", Texture.class),"Paladin of Naagaan",5,3,5);
			break;
		case 5:
			card = new Card(manager.get("Cards/Phantom.jpg", Texture.class),"Phantom",1,1,1,Card.FLY);
			break;
		case 6:
			card = new Card(manager.get("Cards/Rhinoceros.jpg", Texture.class),"Rhinoceros",3,3,3,Card.CRUSH);
			break;
		case 7:
			card = new Card(manager.get("Cards/Rigid Buffalo.jpg", Texture.class),"Rigid Buffalo",2,2,3);
			break;
		case 8:
			card = new Card(manager.get("Cards/Risen Lancer.jpg", Texture.class),"Risen Lancer",2,3,1);
			break;
		case 9:
			card = new Card(manager.get("Cards/Rotroot Enchanter.jpg", Texture.class),"Rotroot Enchanter",5,3,5,Card.SKYGUARD);
			break;
		case 10:
			card = new Card(manager.get("Cards/Rotting Buffalo.jpg", Texture.class),"Rotting Buffalo",3,2,3);
			break;
		case 11:
			card = new Card(manager.get("Cards/Smashodon.jpg", Texture.class),"Smashodon",6,5,5);
			break;
		case 12:
			card = new Card(manager.get("Cards/Spearcliff Pegasus.jpg", Texture.class),"Spearcliff Pegasus",3,2,1,Card.FLY);
			break;
		case 13:
			card = new Card(manager.get("Cards/Stalwart Spirit.jpg", Texture.class),"Stalwart Spirit",4,3,3);
			break;
		case 14:
			card = new Card(manager.get("Cards/Startouched Brave.jpg", Texture.class),"Startouched Brave",4,0,7);
			break;
		case 15:
			card = new Card(manager.get("Cards/Sterling Skywatcher.jpg", Texture.class),"Sterling Skywatcher",2,2,2,Card.SKYGUARD);
			break;
		case 16:
			card = new Card(manager.get("Cards/Trotting Buffalo.jpg", Texture.class),"Trotting Buffalo",2,2,3);
			break;
		case 17:
			card = new Card(manager.get("Cards/Tyrannosaurus Hex.jpg", Texture.class),"Tyrannosaurus Hex",6,6,4);
			break;
		case 18:
			card = new Card(manager.get("Cards/Vine Trap.jpg", Texture.class),"Vine Trap",3,2,4);
			break;
		case 19:
			card = new Card(manager.get("Cards/Wild Child.jpg", Texture.class),"Wild Child",2,2,2);
			break;
		case 20:
			card = new Card(manager.get("Cards/Zombie Vulture.jpg", Texture.class),"Zombie Vulture",5,4,1,Card.FLY);
			break;
		case 21:
			card = new Card(manager.get("Cards/Zombie.jpg", Texture.class),"Zombie",2,2,2);
			break;
		}
		return card;
	}

}
