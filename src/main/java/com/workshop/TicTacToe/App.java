package com.workshop.TicTacToe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello to TicTacToe Program!");
        TicTacToe ticTacToeObject = new TicTacToe();
        ticTacToeObject.ticTacToeBoard();
        ticTacToeObject.playerChoice();
    }
}
