package com.kodilla.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.util.List;

public class NewHandler {

    private Label label;
    private List<Button> buttons;
    private GameStatus gameStatus;

    public NewHandler(Label label, List<Button> buttons, GameStatus gameStatus) {
        this.label = label;
        this.buttons = buttons;
        this.gameStatus = gameStatus;
    }

    public void mouseHandler(Button button, int buttonIndex) {

        button.setFont(Font.font(55.5));

        button.setOnMouseClicked(event -> {

            gameStatus.makeMove(buttonIndex);

            drawGameStatus(gameStatus);

            button.setDisable(true);

            for (Button button1 : buttons) {
                if (button1.getText().equals("O")) {
                    button1.setDisable(true);
                } if (label.getText().equals("X_WINS") || label.getText().equals("O_WINS")) {
                    button1.setDisable(true);
                }
            }
        });
    }

    public void drawGameStatus(GameStatus gameStatus) {

        for (int i = 0; i < gameStatus.getFields().size(); i++) {

            buttons.get(i).setText(gameStatus.getFields().get(i).getPlayer().toString());
        }

        label.setText(gameStatus.getStatus().toString());
    }
}