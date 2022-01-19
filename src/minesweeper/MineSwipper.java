/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minesweeper;

import java.util.Random;

/**
 *
 * @author יאיר
 */
public class MineSwipper {

    /**
     * @param args the command line arguments
     */
    /*
    // rowX=row of the board, colY=column of the board, mines=number of the mines in game     
     */
    private static int rowX, colY, mines;

    public static void main(String[] args) {
        // create a board          
        rowX = 10;    //10 rows
        colY = 10;    //10 column
        mines = 30;     //30 mines

        newGame(30);
        for (int i = 0; i < rowX; i++) {     //for the rows
            for (int j = 0; j < colY; j++) {      //for the column
                System.out.print(" _ ");
            }
            System.out.println();
        }

    }

    private static int newGame(int i) {
        return 0;
    }

    public void Validiation(int rowX, int colY, int mines) throws IllegalArgumentException {

    }
}
