package com.samara.ant.controller;

import com.samara.ant.model.Player;

/**
 * Created by user on 25.04.2016.
 */
public class Game {
    private static final String GAME_NAME = "XO";

    private Player[] players;

    public Game() {

    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(int x, int y) {
        return false;
    }

    public static String getGameName() {
        return Game.GAME_NAME;
    }

    public Player[] getPlayers() {
        return players;
    }
}
