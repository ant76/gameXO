package com.samara.ant.ui;

import com.samara.ant.controller.Game;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by user on 25.04.2016.
 */
public class ConsoleView {
    private final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }

    public void showGameName() {
        System.out.println(Game.getGameName());
    }

    public void showPlayersName() {
        System.out.println(game.getPlayers());
    }
}
