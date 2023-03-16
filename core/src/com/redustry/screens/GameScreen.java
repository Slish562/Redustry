package com.redustry.screens;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.ScreenUtils;
import com.redustry.Main;
import com.redustry.lib.graphics.Screens;
import com.redustry.сore.Core;

public class GameScreen implements Screen {

    public Main main;
    Stage stage;
    Table table;
    TextButton button;

    public GameScreen(Main main) {
        this.main = main;
    }

    @Override
    public void show() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        table = new Table();
        button = new TextButton("", Core.skin);
        table.setPosition(Gdx.graphics.getWidth() - button.getWidth(), Gdx.graphics.getHeight() - button.getHeight());
        TextButton mm = new TextButton("Main Menu", Core.skin);
        mm.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                main.changeScreen(Screens.MENU);
            }
        });
        table.add(mm, button);
        stage.addActor(table);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.CLEAR);
        button.setText("fps " + Gdx.graphics.getFramesPerSecond());
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
