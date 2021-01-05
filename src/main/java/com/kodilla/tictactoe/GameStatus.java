package com.kodilla.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class GameStatus {

    private Status status;
    private List<Field> fields;
    private int round;
    private final ComputerMover computerMover;

    public GameStatus(Status status, List<Field> fields, int round, ComputerMover computerMover) {
        this.status = status;
        this.fields = fields;
        this.round = round;
        this.computerMover = computerMover;
    }

    public Status getStatus() {
        return status;
    }

    public List<Field> getFields() {
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

        List<Field> fields = initializeFields();

        ComputerMover computerMover = new RandomComputerMover();

        return new GameStatus(Status.GAME_ON, fields, 1, computerMover);
    }

    private static List<Field> initializeFields() {

        List<Field> emptyFields = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            emptyFields.add(new Field(Field.Player.EMPTY));
        }
        return emptyFields;
    }

    public GameStatus makeMove(GameStatus current, int clickedField) {

        List<Field> newFields = current.getFields();
        newFields.set(clickedField, new Field(Field.Player.X));
        Status newStatus = current.calculateStatus();
        List<Field> newFieldsWithComputerMove = computerMover.makeMove(newFields);

        return new GameStatus(newStatus, newFieldsWithComputerMove, round++, computerMover);

    }

    public Status calculateStatus() {
        boolean xWon = checkWinCondition(Field.Player.X);
        if (xWon) {
            return Status.X_WINS;
        }
        boolean oWon = checkWinCondition(Field.Player.O);

        if (oWon) {
            return Status.O_WINS;
        }
        if (round >= 9) {
            return Status.DRAW;
        }
        return Status.GAME_ON;
    }

    private boolean checkWinCondition(Field.Player player) {
        boolean rowsWon = checkRows();

        if (rowsWon) {
            return true;
        }
//        boolean columnsWon = checkColumns(player);
//        if (columnsWon) {
//            return true;
//        }
//        boolean diagonallyWon = checkDiagonally(player);
//
//        if (diagonallyWon) {
//            return true;
//        }
        return false;
    }

//    private boolean checkDiagonally(Field.Player player) {
//        if (fields.get(0).getPlayer() != player &&
//                fields.get(3).getPlayer() != player &&
//                fields.get(8).getPlayer() != player || fields.get(2).getPlayer() != player &&
//                fields.get(3).getPlayer() != player &&
//                fields.get(6).getPlayer() != player) {
//            return false;
//        }
//        return true;
//    }

    private boolean checkRows() {

            boolean row1won = checkRow(0);
            boolean row2won = checkRow(3);
            boolean row3won = checkRow(6);

            if (row1won || row2won || row3won) {
                return true;
        }
        return false;
    }

    private boolean checkRow(int indexAddition) {

            if (fields.get(indexAddition).getPlayer() == fields.get(indexAddition + 1).getPlayer() &&
                    fields.get(indexAddition + 1).getPlayer() == (fields.get(indexAddition + 2).getPlayer())) {
                return true;
            }
        return false;
    }
}