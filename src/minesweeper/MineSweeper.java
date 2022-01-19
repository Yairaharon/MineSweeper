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
public class Minesweeper {

    private int minesCount = 30;       //count of mines
    private int boardV[][];        //the game board -CAN BE CHANGE
    private int boardDB[][];        // the game board in the data-NOT CHANGE
    private int rowCount = 20;         //count of row
    private int columnCount = 20;      //count of column

    public int[][] getBoardV() {
        return boardV;
    }

    public void setBoardV(int[][] boardV) {
        this.boardV = boardV;
    }

    public int[][] getBoardDB() {
        return boardDB;
    }

    public void setBoardDB(int[][] boardDB) {
        this.boardDB = boardDB;
    }

    public int getMinesCount() {
        return minesCount;
    }

    public void setMinesCount(int minesCount) {
        this.minesCount = minesCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Minesweeper(int minesCount, int rowCount, int columnCount) {   //constractour
        this.minesCount = minesCount;
        boardV = new int[rowCount][columnCount];
        boardDB = new int[rowCount][columnCount];
        printBoard();
        newGame();

    }

    private void printBoard() {                    //print new board after every press V
        for (int i = 0; i < rowCount; i++) {       //for the rows
            for (int j = 0; j < columnCount; j++) {  //for the column
                System.out.print(boardV[i][j] + "|");
            }
            System.out.println();
        }

        throwBombos();
    }

    private void newGame() {          //function that make new-board for the DB    

        throwBombos();

    }

    public int myRND() {
        int num = (int) (Math.random() * 50); //returns an integer 
        return num;
    }

    private void throwBombos() {

        Random rnd = new Random();
    
//        int minesremaind = minesCount;
//        while (minesremaind > 0) {
//            int min = 0;
//            int max = 9;
//            int random_i = (int) Math.floor(Math.random() * (max - min + 1) + min);
//            int random_j = (int) Math.floor(Math.random() * (max - min + 1) + min);
//
//            if (boardDB[random_i][random_j] == -1) {
//                continue;
//
//            } else {
//                boardDB[random_i][random_j] = -1;
//                numberOfBombs(random_i, random_j);
//            }
//            minesremaind--;
//        }
//        printBoard();
    }

    /*@paramet minesCount cant be loewr or eqal to 0 or be eqal to number of the squares in thr board 
           @paramet rowCount cant be loewr or eqal to 0 or be highr then 20 
          @paramet columnCount cant be loewr or eqal to 0 or be highr then 20 
     */
    public void validiation(int rowCount, int columnCount, int minesCount) throws IllegalArgumentException {
        if ((minesCount <= 0 || minesCount >= (rowCount * columnCount))
                || (rowCount <= 0 || rowCount > 20) || (columnCount <= 0 || columnCount > 20)) {
            throw new IllegalArgumentException("erorr in one of the paramters");
        }
    }

    /*
    private int throwBoombs() {     //function that throw boombs in random place
         newGame();
        int mines=1;
        while (mines<=30){
        int i;
        int j;
        Random rand = new Random();
        int n = rand.nextInt();
        int m = rand.nextInt();
        System.out.print(" -1");
        mines++;
      }
        return 0;
    }
     */
    private void numberOfBombs(int x, int y) {
        for (int i = x - 1; i >= x + 1; i++) {
            for (int j = y - 1; j >= 2; j++) {
                if (!((i == -1 || i == 21) || (j == -1 || j == 21 || boardDB[i][j] == -1))) {
                    boardDB[i][j]++;
                }
            }
        }

    }


    /*
            
    private char[][] show;
    private int[][] full;
    private int mines;  //מוקשים
    private boolean runing;
    private String Endmassege;

    public Minesweeper(int row, int column, int mines) {
        if (row > 0 && column > 0 && mines <= (row * column) - 1) {
            this.show = new char[row][column];
            this.full = new int[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; i++) {
                    this.show[i][j] = ' ';
                }
            }
        } else {
            System.out.println("The number is illegal");
        }
        //Random rnd=new Random();

    }*/ /*  public void bombOnBoard() {
        Random rnd = new Random();
        int mines, row, column;
        row = rnd.nextInt(full.length);
        column = rnd.nextInt(full.length);
        
        
        
    }*/
}
