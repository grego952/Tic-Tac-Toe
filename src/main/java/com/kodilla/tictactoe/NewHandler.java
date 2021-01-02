package com.kodilla.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.util.List;
import java.util.Random;

public class NewHandler {

    private Label label;
    private List<Button> buttons;
    private List<Field> fields;
    private GameStatus gameStatus;
    private Field field;

    public NewHandler(Label label, List<Button> buttons, GameStatus gameStatus, List<Field> fields, Field field) {
        this.label = label;
        this.buttons = buttons;
        this.gameStatus = gameStatus;
        this.fields = fields;
        this.field = field;
        drawGameStatus(gameStatus, field);

    }

    public void mouseHandler(Button button) {

        RandomComputerMover randomComputerMover = new RandomComputerMover();

        button.setFont(Font.font(55.5));

        button.setOnMouseClicked(event -> {

            gameStatus.makeMove(gameStatus, 1);

            gameStatus.calculateStatus();

            button.setText(Field.Player.X.toString());

            randomComputerMover.makeComputerMove();

            button.setDisable(true);

        });
    }

    public void drawGameStatus(GameStatus status, Field field) {
        buttons.get(0).setText(field.getPlayer().toString());
        buttons.get(1).setText(field.getPlayer().toString());
        buttons.get(2).setText(field.getPlayer().toString());
        buttons.get(3).setText(field.getPlayer().toString());
        buttons.get(4).setText(field.getPlayer().toString());
        buttons.get(5).setText(field.getPlayer().toString());
        buttons.get(6).setText(field.getPlayer().toString());
        buttons.get(7).setText(field.getPlayer().toString());
        buttons.get(8).setText(field.getPlayer().toString());

        label.setText(status.getStatus().toString());
    }
}