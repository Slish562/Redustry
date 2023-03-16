package com.redustry.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.redustry.Main;
import com.redustry.lib.graphics.Screens;
import com.redustry.сore.Core;

public class MenuScreen implements Screen {

    private Main main;

    public MenuScreen(Main main) {
        this.main = main;
    }

    public Stage stage;
    Table table;

    @Override
    public void show() {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        table = new Table();

        table.setFillParent(true);
        //table.setDebug(true);

        TextButton f = new TextButton("l", Core.skin);
        table.add(f);
        f.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                main.changeScreen(Screens.GAME);
            }
        });
        stage.addActor(table);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.CLEAR);
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
        stage.dispose();
    }
}
