package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContratGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		//var game = new SuperContratGame();
		
		var game = new PacmanGame(); //1 : Object Creation
		
		
		var gameRunner = new GameRunner(game); // => we're injecting the dependency in, 
											// the game class is created and it's injected or it's wired into the GameRunner class
				//2 : Object Creation + Wiring of Dependencies
				// Game is a Dependency of GameRunner
		
		gameRunner.run();

	}

}
