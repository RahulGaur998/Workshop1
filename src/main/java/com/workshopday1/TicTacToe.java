/*As a Player would like to
start fresh by creating a tic
tac toe board - Create a TicTacToeGame class - Create method for every use case
and call from main
- Create a board of char[] of size 10
and assign empty space to each
element */
package com.workshopday1;

public class TicTacToe {
    char[] board;

    /* @method: Create Empty board with empty values */
    void ticTacToeBoard() {
        board = new char[10];
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
            System.out.println(board[i]);
        }
    }
}
