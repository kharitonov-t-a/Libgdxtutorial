package com.lazycoomunity.game;

import com.badlogic.gdx.Game;
import com.lazycoomunity.game.screens.GameScreen;

public class MyGame extends   Game  {
	//public GameScreen game;
	public GameScreen game;
	@Override
	public void create() {
		// TODO Auto-generated method stub

		game = new GameScreen();
		setScreen(game);
	}

	@Override
	public void resize(int width, int height) {

	}
/*
	@Override
	public void render() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
	*/

}
