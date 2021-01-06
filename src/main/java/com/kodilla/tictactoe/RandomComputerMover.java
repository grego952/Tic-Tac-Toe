package com.kodilla.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomComputerMover implements ComputerMover {


    public void makeMove(List<Field> currentFields) {

        List<Integer> emptyIndexes = new ArrayList<>();

        for (int i = 0; i < currentFields.size(); i++) {
            if (currentFields.get(i).getPlayer() == Field.Player.EMPTY) {
                emptyIndexes.add(i);
            }
        }
        if (emptyIndexes.isEmpty()) {
            return;
        }

        Random random = new Random();
        int indexToFill = emptyIndexes.get(random.nextInt(emptyIndexes.size()));
        currentFields.set(indexToFill, new Field(Field.Player.O));
    }
}