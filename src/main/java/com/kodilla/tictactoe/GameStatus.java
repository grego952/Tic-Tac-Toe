package com.kodilla.tictactoe;

import java.util.List;

public class GameStatus {

    private Status status;
    private Field [][] fields;
    private int round;
    private final ComputerMover computerMover;

    public GameStatus(Status status, Field [][] fields, int round, ComputerMover computerMover) {
        this.status = status;
        this.fields = fields;
        this.round = round;
        this.computerMover = computerMover;
    }

    public Status getStatus() {
        return status;
    }

    public Field [][] getFields() {
        return fields;
    }

    public int getRound() {
        return round;
    }

    public ComputerMover getComputerMover() {
        return computerMover;
    }

    public enum Status {
        GAME_ON, O_WINS, X_WINS, DRAW
    }

    public static GameStatus initialGameStatus() {

        Field [][] fields = initializeFields();

        ComputerMover computerMover = new RandomComputerMover();

        return new GameStatus(Status.GAME_ON, fields, 1, computerMover);
    }

    private static Field[][] initializeFields() {

        Field [][] emptyFields = new Field[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                emptyFields[i][j] = new Field(Field.Player.EMPTY);
            }
        }
        return emptyFields;
    }

    public Status calculateStatus(Status status) {
        boolean xWon = checkWinCondition(Field.Player.X);
        if (xWon) {
            return Status.X_WINS;
        }
        boolean oWon = checkWinCondition(Field.Player.O);

        if (oWon) {
            return Status.O_WINS;
        }
        if (round >=9) {
            return Status.DRAW;
        }
        return Status.GAME_ON;
    }

    private boolean checkWinCondition(Field.Player player) {
        boolean rowsWon = checkRows(player);
        if (rowsWon) {
            return true;
        }
        boolean columnsWon = checkColumns(player);
        if (columnsWon) {
            return true;
        }
        boolean diagonallyWon = checkDiagonally(player);

        if (diagonallyWon) {

            return true;
        }
        return false;
    }

    private boolean checkDiagonally(Field.Player player) {
        if (fields[0][0].getPlayer() != player &&
                fields [1][1].getPlayer() != player &&
                fields [2][2].getPlayer() != player || fields[0][2].getPlayer() != player &&
                fields [1][1].getPlayer() != player &&
                fields [2][0].getPlayer() != player) {
            return false;
        }
        return true;
    }

    private boolean checkColumns(Field.Player player) {

        for (int i = 0; i < 3; i++) {
            boolean won = checkColumn(player, i);
            if (won) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumn(Field.Player player, int columnIndex) {
        for (int i = 0; i < 3; i++) {

            if (fields[columnIndex][i].getPlayer()!= player) {
                return false;
            }
        }
        return true;
    }

    private boolean checkRows(Field.Player player) {
        for (int i = 0; i < 3; i++) {
            boolean won = checkRow(player, i);
            if (won) {
                return true;
            }
        }
        return false;
    }

    private boolean checkRow(Field.Player player, int rowIndex) {

        for (int i = 0; i < 3; i++) {

            if (fields[rowIndex][i].getPlayer() != player) {
                return false;
            }
        }
        return true;
    }
}