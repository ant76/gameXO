package com.samara.ant;

import com.samara.ant.model.Board;
import com.samara.ant.controller.Game;
import com.samara.ant.ui.AdvConsoleView;
import com.samara.ant.ui.ConsoleView;

public class Main {

    public static void main(String[] args) {

        final Game game = new Game();
//	    final Board board = new Board();
//        printGameNameAndBoard(game, board);
        final AdvConsoleView aview = new AdvConsoleView(game);
        final ConsoleView cview = new ConsoleView(game);

        startGame(aview);

    }

    private static void startGame(final ConsoleView view){
        view.showGameName();
        view.showPlayersName();
    }

}
