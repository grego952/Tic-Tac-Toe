package com.kodilla.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Handler {

    private Label label;
    private List<Button> buttons;

    public Handler(Label label, List<Button> buttons) {
        this.label = label;
        this.buttons = buttons;
    }

    Label gameStatus = new Label();

    public void mouseHandler(Button button) {

        button.setFont(Font.font(55.5));

        button.setOnMouseClicked(event -> {

            String text = label.getText();

            int round = Integer.parseInt(text);

            button.setText("X");

            round++;
            makeComputerMove();
            button.setDisable(true);

            label.setText(String.valueOf(round));

            String status = calculateGameStatus();
            gameStatus.setText(status);
        });
    }

    public String calculateGameStatus() {

        if (buttons.get(0).getText().equals("X") &&
                buttons.get(1).getText().equals("X") &&
                buttons.get(2).getText().equals("X")) {
            label.setText("X won");

        }
        if (buttons.get(3).getText().equals("X") &&
                buttons.get(4).getText().equals("X") &&
                buttons.get(5).getText().equals("X")) {
            label.setText("X won");

        }
        if (buttons.get(6).getText().equals("X") &&
                buttons.get(7).getText().equals("X") &&
                buttons.get(8).getText().equals("X")) {
            label.setText("X won");

        }
        if (buttons.get(0).getText().equals("X") &&
                buttons.get(3).getText().equals("X") &&
                buttons.get(6).getText().equals("X")) {
            label.setText("X won");

        }
        if (buttons.get(1).getText().equals("X") &&
                buttons.get(4).getText().equals("X") &&
                buttons.get(7).getText().equals("X")) {
            label.setText("X won");

        }
        if (buttons.get(2).getText().equals("X") &&
                buttons.get(5).getText().equals("X") &&
                buttons.get(8).getText().equals("X")) {
            label.setText("X won");
        }
        if (buttons.get(0).getText().equals("X") &&
                buttons.get(4).getText().equals("X") &&
                buttons.get(8).getText().equals("X")) {
            label.setText("X won");
        }
        if (buttons.get(2).getText().equals("X") &&
                buttons.get(4).getText().equals("X") &&
                buttons.get(6).getText().equals("X")) {
            label.setText("X won");

        }
        if (buttons.get(0).getText().equals("O") &&
                buttons.get(1).getText().equals("O") &&
                buttons.get(2).getText().equals("O")) {
            label.setText("O won");

        }
        if (buttons.get(3).getText().equals("O") &&
                buttons.get(4).getText().equals("O") &&
                buttons.get(5).getText().equals("O")) {
            label.setText("O won");

        }
        if (buttons.get(6).getText().equals("O") &&
                buttons.get(7).getText().equals("O") &&
                buttons.get(8).getText().equals("O")) {
            label.setText("O won");

        }
        if (buttons.get(0).getText().equals("O") &&
                buttons.get(3).getText().equals("O") &&
                buttons.get(6).getText().equals("O")) {
            label.setText("O won");

        }
        if (buttons.get(1).getText().equals("O") &&
                buttons.get(4).getText().equals("O") &&
                buttons.get(7).getText().equals("O")) {
            label.setText("O won");

        }
        if (buttons.get(2).getText().equals("O") &&
                buttons.get(5).getText().equals("O") &&
                buttons.get(8).getText().equals("O")) {
            label.setText("O won");

        }
        if (buttons.get(0).getText().equals("O") &&
                buttons.get(4).getText().equals("O") &&
                buttons.get(8).getText().equals("O")) {
            label.setText("O won");
        }
        if (buttons.get(2).getText().equals("O") &&
                buttons.get(4).getText().equals("O") &&
                buttons.get(6).getText().equals("O")) {
            label.setText("O won");
        }
        return "game on";
    }

    public void makeComputerMove() {

        Random random = new Random();
        List<Button> emptyButtons = new ArrayList<>();

        for (Button button : buttons) {
            if (button.getText().equals("O")) {
                button.setDisable(true);
            }

            if (button.getText().equals("")) {
                emptyButtons.add(button);
            }
        }
        emptyButtons.get(random.nextInt(emptyButtons.size())).setText("O");
        if (buttons.get(0).getText().equals("O")) {
            buttons.get(0).setDisable(true);

        }
        if (buttons.get(1).getText().equals("O")) {
            buttons.get(1).setDisable(true);

        }
        if (buttons.get(2).getText().equals("O")) {
            buttons.get(2).setDisable(true);

        }
        if (buttons.get(3).getText().equals("O")) {
            buttons.get(3).setDisable(true);

        }
        if (buttons.get(4).getText().equals("O")) {
            buttons.get(4).setDisable(true);

        }
        if (buttons.get(5).getText().equals("O")) {
            buttons.get(5).setDisable(true);

        }
        if (buttons.get(6).getText().equals("O")) {
            buttons.get(6).setDisable(true);

        }
        if (buttons.get(7).getText().equals("O")) {
            buttons.get(7).setDisable(true);

        }
        if (buttons.get(8).getText().equals("O")) {
            buttons.get(8).setDisable(true);
        }
    }
}