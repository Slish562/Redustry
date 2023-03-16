package com.redustry;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;
import com.redustry.lib.graphics.Assets;
import com.redustry.screens.GameScreen;
import com.redustry.screens.MenuScreen;
import com.redustry.сore.Core;

import static com.redustry.lib.graphics.Screens.GAME;
import static com.redustry.lib.graphics.Screens.MENU;

public class Main extends Game {
	private MenuScreen menuScreen;
	private GameScreen gameScreen;

	private AssetManager manager;

	@Override
	public void create() {
		manager = Assets.load();
		Core.atlas = manager.get(Assets.atlas, TextureAtlas.class);
		Core.skin = manager.get(Assets.skin, Skin.class);
		changeScreen(0);
	}

	public void changeScreen(int id){
		switch (id){
			case (MENU): {
				if(menuScreen == null){
					menuScreen = new MenuScreen(this);
					setScreen(menuScreen);
					break;
				}
			}
			case (GAME): {
				if(gameScreen == null){
					gameScreen = new GameScreen(this);
					setScreen(gameScreen);
					break;
				}
			}
		}
	}
}
