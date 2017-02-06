package com.chasebabbitt.hexgame.strategy;


import com.chasebabbitt.hexgame.actors.Player;

public interface Strategy {

	public Move getMove(Player defender, Player attacker);
}
