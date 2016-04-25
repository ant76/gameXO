package com.samara.ant.ui;

import com.samara.ant.controller.Game;

/**
 * Created by user on 25.04.2016.
 */
public class AdvConsoleView extends ConsoleView{

    public AdvConsoleView(Game game) {
        super(game);
    }

    @Override
    public void showGameName() {
        System.out.println("****");
        System.out.println(Game.getGameName());
    }

}
