/* 
 * @author : Rahul
 */
package com.workshop.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    char[] board;
    private char player, computer;

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
    }

    public char getComputer() {
        return computer;
    }

    public void setComputer(char computer) {
        this.computer = computer;
    }

    Scanner scannerObject = new Scanner(System.in);

    /* @method: Create Empty board with empty values */
    void ticTacToeBoard() {
        board = new char[10];
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
            System.out.println(board[i]);
        }
    }

    /*
     * @method setPlayer and setComputer value on basis of player selection X or O
     */
    void playerChoice() {
        System.out.println("Please Select Your Choice Letter : 'X' or 'O' ");
        char choice = scannerObject.next().charAt(0);
        if (choice == 'X') {
            setPlayer('X');
            setComputer('O');
        } else if (choice == 'O') {
            setPlayer('O');
            setComputer('X');
        } else {
            System.out.println("Invalid Choice");
        }
    }

}
