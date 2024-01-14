package com.in28minutes.learnspringframework.game;

public class GameRunner {
	
	private IGamingConsole game;
	
	public GameRunner(IGamingConsole game){
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
