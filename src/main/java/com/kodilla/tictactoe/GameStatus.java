package com.kodilla.tictactoe;

import javafx.scene.control.Button;

public class GameStatus {

    private static Status status;

    private ComputerMover computerMover;

    public GameStatus(Status status) {
        this.status = status;
    }

   public static void createInitialStatus() {

        status.addField(new Field());
       status.addField(new Field());
       status.addField(new Field());
       status.addField(new Field());
       status.addField(new Field());
       status.addField(new Field());
       status.addField(new Field());
       status.addField(new Field());
       status.addField(new Field());

       Status initialStatus = status.GAME_ON;

   }
   public void calculateStatus (Status status) {

        boolean isThereThreeSameXInRows;
       boolean isThereThreeSameXInColumns;
       boolean isThereThreeSameXDiagonally;
       boolean isThereThreeSameOInRows;
       boolean isThereThreeSameOInColumns;
       boolean isThereThreeSameODiagonally;
   }
}
