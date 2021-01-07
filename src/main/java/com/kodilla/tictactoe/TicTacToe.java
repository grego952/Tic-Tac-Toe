package com.kodilla.tictactoe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends Application {

    Button button1 = new Button();
    Button button2 = new Button();
    Button button3 = new Button();
    Button button4 = new Button();
    Button button5 = new Button();
    Button button6 = new Button();
    Button button7 = new Button();
    Button button8 = new Button();
    Button button9 = new Button();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        List<Button> buttonList = new ArrayList<>();

        buttonList.add(button1);
        buttonList.add(button2);
        buttonList.add(button3);
        buttonList.add(button4);
        buttonList.add(button5);
        buttonList.add(button6);
        buttonList.add(button7);
        buttonList.add(button8);
        buttonList.add(button9);

        GridPane grid = new GridPane();

        Label label = new Label();
        label.setText("0");


        ButtonSetter buttonSetter = new ButtonSetter();

        buttonSetter.buttonSizeConfiguration(button1);
        buttonSetter.buttonSizeConfiguration(button2);
        buttonSetter.buttonSizeConfiguration(button3);
        buttonSetter.buttonSizeConfiguration(button4);
        buttonSetter.buttonSizeConfiguration(button5);
        buttonSetter.buttonSizeConfiguration(button6);
        buttonSetter.buttonSizeConfiguration(button7);
        buttonSetter.buttonSizeConfiguration(button8);
        buttonSetter.buttonSizeConfiguration(button9);

        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setAlignment(Pos.CENTER);

        NewHandler newHandler = new NewHandler(label, buttonList, GameStatus.initialGameStatus(new RandomComputerMover()));

        newHandler.mouseHandler(button1, 0);
        newHandler.mouseHandler(button2, 1);
        newHandler.mouseHandler(button3, 2);
        newHandler.mouseHandler(button4, 3);
        newHandler.mouseHandler(button5, 4);
        newHandler.mouseHandler(button6, 5);
        newHandler.mouseHandler(button7,6);
        newHandler.mouseHandler(button8, 7);
        newHandler.mouseHandler(button9,8);

        grid.add(button1, 0, 0);
        grid.add(button2, 1, 0);
        grid.add(button3, 2, 0);
        grid.add(button4, 0, 1);
        grid.add(button5, 1, 1);
        grid.add(button6, 2, 1);
        grid.add(button7, 0, 2);
        grid.add(button8, 1, 2);
        grid.add(button9, 2, 2);
        grid.add(label, 0, 3);

        Scene scene = new Scene(grid);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}