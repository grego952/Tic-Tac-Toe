package com.kodilla.tictactoe;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomComputerMover implements ComputerMover {

    private List <Field> fields;


    public boolean makeComputerMove() {

        Random random = new Random();
        List<Field> emptyFields = new ArrayList<>();

        for (Field field : fields) {

            if (field.getPlayer() == Field.Player.EMPTY) {
                emptyFields.add(field);
            }
        }
        boolean move = emptyFields.get(random.nextInt(emptyFields.size())).getPlayer() == Field.Player.O;

        return move;

    }

    @Override
    public List<Field> makeMove(List<Field> current) {
        return null;
    }
}