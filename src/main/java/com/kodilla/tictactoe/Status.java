package com.kodilla.tictactoe;

import java.util.ArrayList;
import java.util.List;

public enum Status {
    GAME_ON, X_WINS, O_WINS, DRAW;

    private List<Field> fields = new ArrayList<>();

    public void addField(Field field) {
        fields.add(field);
    }

    public Status isThreeSameXInRowOne () {

        if (fields.contains("X") &&
                fields.get(0).equals(fields.get(1)) &&
                fields.get(1).equals(fields.get(2))) {
            return Status.X_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSameXinRowTwo () {

        if (fields.contains("X") &&
                fields.get(3).equals(fields.get(4)) &&
                fields.get(4).equals(fields.get(5))) {
            return Status.X_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSameXinRowThree () {

        if (fields.contains("X") &&
                fields.get(6).equals(fields.get(7)) &&
                fields.get(7).equals(fields.get(8))) {
            return Status.X_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSameXDiagonally1 () {

        if (fields.contains("X") &&
                fields.get(0).equals(fields.get(4)) &&
                fields.get(4).equals(fields.get(8))) {
            return Status.X_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSameXDiagonally2 () {

        if (fields.contains("X") &&
                fields.get(2).equals(fields.get(4)) &&
                fields.get(4).equals(fields.get(6))) {
            return Status.X_WINS;
        }
        return Status.GAME_ON;
    }
    public Status isThreeSameOInRowOne () {

        if (fields.contains("O") &&
                fields.get(0).equals(fields.get(1)) &&
                fields.get(1).equals(fields.get(2))) {
            return Status.O_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSame0inRowTwo () {

        if (fields.contains("0") &&
                fields.get(3).equals(fields.get(4)) &&
                fields.get(4).equals(fields.get(5))) {
            return Status.O_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSameOinRowThree () {

        if (fields.contains("O") &&
                fields.get(6).equals(fields.get(7)) &&
                fields.get(7).equals(fields.get(8))) {
            return Status.O_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSameODiagonally1 () {

        if (fields.contains("O") &&
                fields.get(0).equals(fields.get(4)) &&
                fields.get(4).equals(fields.get(8))) {
            return Status.O_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThreeSameODiagonally2 () {

        if (fields.contains("O") &&
                fields.get(2).equals(fields.get(4)) &&
                fields.get(4).equals(fields.get(6))) {
            return Status.O_WINS;
        }
        return Status.GAME_ON;
    }

    public Status isThereADraw () {
        if (!fields.isEmpty()) {
            return Status.DRAW;
        }
        return Status.GAME_ON;
    }
}


