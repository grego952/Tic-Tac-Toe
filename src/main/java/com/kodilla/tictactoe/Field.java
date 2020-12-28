package com.kodilla.tictactoe;

public class Field {

    private Player player;

    public Field(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public enum Player {
        EMPTY, X, O
    }
}
