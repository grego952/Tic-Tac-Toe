package com.kodilla.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomComputerMover implements ComputerMover {


    public List<Field> makeMove(List<Field> currentFields) {

        List<Integer> emptyIndexes = new ArrayList<>();

        for (int i = 0; i < currentFields.size(); i++) {
            if (currentFields.get(i).getPlayer() == Field.Player.EMPTY) {
                emptyIndexes.add(i);
            }
        }

        Random random = new Random();
        int indexToFill = emptyIndexes.get(random.nextInt(emptyIndexes.size()));
        List<Field> newFields = new ArrayList<>();

        for (int i = 0; i < currentFields.size(); i++) {

            if (i == indexToFill) {
                newFields.add(new Field(Field.Player.O));
            } else {
                newFields.add(currentFields.get(i));
            }
        }
        return newFields;
    }
}