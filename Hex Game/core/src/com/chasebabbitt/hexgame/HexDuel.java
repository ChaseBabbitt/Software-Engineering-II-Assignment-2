package com.chasebabbitt.hexgame;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.chasebabbitt.hexgame.actors.Player;
import com.chasebabbitt.hexgame.strategy.Move;
public class HexDuel extends Thread {
	

	Move suggestedmove;

	Player player1,player2;
	Player attackingPlayer, defendingPlayer;

	Label player2label;
	Label player1label;
	Label attackingPlayersLabel;
	Label moveLabel;
	
	public HexDuel(){


		player1 = new Player(20,"Player 1",player2);
		player2 = new Player(20, "Player 2",player1);
		
		
		attackingPlayer = player1;
		defendingPlayer = player2;
		
		createLabels();
				
		TestCase1();
		
		
		
	}
	
	public void run(){
		while(true){

			
			
		}
		
	}
	
	Player play(){
		Player winner;
		while(null==(winner=findWinner())){
			
		}
		return winner;
	}
	
	Player findWinner(){
		return null;
	}
	public void draw(SpriteBatch batch){
		player1.draw(batch,0,450);
		player2.draw(batch,0,0);
		player2label.draw(batch,1);
		player1label.draw(batch,1);
		attackingPlayersLabel.draw(batch, 1);
		if(suggestedmove!=null){
			moveLabel.draw(batch, 1);
			suggestedmove.draw(batch);
		}
		
	}

	private void createLabels(){
		Label.LabelStyle font = new Label.LabelStyle(new BitmapFont(), Color.WHITE);
		
		
		player2label = new Label(String.format("%s, Health: %d",player2.getName(),player2.getPlayerHealth()),font);
		player2label.setFontScale(3);
		player2label.setPosition(0, 240);
		
		player1label = new Label(String.format("%s, Health: %d",player1.getName(),player1.getPlayerHealth()),font);
		player1label.setFontScale(3);
		player1label.setPosition(0, 690);
		
		attackingPlayersLabel = new Label(String.format("%s is attacking.",player1.getName()),font);
		attackingPlayersLabel.setFontScale(3);
		attackingPlayersLabel.setPosition(0, 370);
		
		moveLabel = new Label("Suggested Move",font);
		moveLabel.setFontScale(3);
		moveLabel.setPosition(860, 350);
	}
	public void TestCase1(){
		suggestedmove = null;
		player1.setTestCase1A();
		player2.setTestCase1D();
		player2label.setText(String.format("%s, Health: %d",player2.getName(),player2.getPlayerHealth()));
		player1label.setText(String.format("%s, Health: %d",player1.getName(),player1.getPlayerHealth()));
		player1.toConsole();
		player2.toConsole();
		
	}
	public void TestCase2(){
		suggestedmove = null;
		player1.setTestCase2A();
		player2.setTestCase2D();
		player2label.setText(String.format("%s, Health: %d",player2.getName(),player2.getPlayerHealth()));
		player1label.setText(String.format("%s, Health: %d",player1.getName(),player1.getPlayerHealth()));
		player1.toConsole();
		player2.toConsole();
	}
	
	//Creates a random test case consisting of 4 Enemy Cards and 4 Player Cards and Player's health is 10
	public void RandomCase(){
		suggestedmove = null;
		player1.setRandomCaseA();
		player2.setRandomCaseD();
		player2label.setText(String.format("%s, Health: %d",player2.getName(),player2.getPlayerHealth()));
		player1label.setText(String.format("%s, Health: %d",player1.getName(),player1.getPlayerHealth()));
		player1.toConsole();
		player2.toConsole();
	}
	
	/*public Array<Card> getAttackingCards(){
		return enemyfield.getCards();
	}
	
	public void removeAttackingCard(Card card){
		enemyfield.removeCard(card);
	}
	
	public Array<Card> getDefendingCards(){
		return playerfield.getCards();
	}
	
	public void removeDefendingCard(Card card){
		playerfield.removeCard(card);
	}*/
	//Method for getting information about player's health
	public int getPlayerHealth(){
		return player1.getPlayerHealth();
	}
	
	/**
	 * Method to call the defending player's strategy method
	 */
	public void suggestMove(){
		suggestedmove = defendingPlayer.getMove();
		if(suggestedmove!=null){
			//suggestedmove.consoleDisplay();
			suggestedmove.execute();
			player2label.setText(String.format("%s, Health: %d",player2.getName(),player2.getPlayerHealth()));
			player1label.setText(String.format("%s, Health: %d",player1.getName(),player1.getPlayerHealth()));
		}
		player1.toConsole();
		player2.toConsole();
	}
	public Player getAttackingPlayer(){
		return attackingPlayer;
	}
	public Player getDefendingPlayer(){
		return defendingPlayer;
	}
	/**
	 * Calls method to set player two's strategy to the dumb strategy
	 */
	public void setPlayer2DumbStrategy(){
		player2.setDumbStrategy();
	}
	/**
	 * Calls method to set player two's strategy to the smart defense strategy
	 */
	public void setPlayer2DefenseStrategy(){
		player2.setDefenseStrategy();
	}
}
