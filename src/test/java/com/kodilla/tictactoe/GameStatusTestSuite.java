package com.kodilla.tictactoe;

import org.junit.jupiter.api.*;

public class GameStatusTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println ("Starting tests of Tic Tac Toe moves");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("Tests finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Starting test # " + testCounter++);
    }

    @Test
    void testRow1Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(0);
        gameStatus.makeMove(1);
        gameStatus.makeMove(2);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);

    }

    @Test
    void testRow2Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(3);
        gameStatus.makeMove(4);
        gameStatus.makeMove(5);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);

    }

    @Test
    void testRow3Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(6);
        gameStatus.makeMove(7);
        gameStatus.makeMove(8);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);

    }
    @Test
    void testColumn1Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(0);
        gameStatus.makeMove(3);
        gameStatus.makeMove(6);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);

    }

    @Test
    void testColumn2Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(1);
        gameStatus.makeMove(4);
        gameStatus.makeMove(7);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);
    }

    @Test
    void testColumn3Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(2);
        gameStatus.makeMove(5);
        gameStatus.makeMove(8);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);
    }
    @Test
    void testDiagonally1Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(0);
        gameStatus.makeMove(4);
        gameStatus.makeMove(8);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);
    }
    @Test
    void testDiagonally2Wins() {

        //given

        GameStatus gameStatus = GameStatus.initialGameStatus(new MockComputerMover());

        //when

        gameStatus.makeMove(2);
        gameStatus.makeMove(4);
        gameStatus.makeMove(6);

        //then

        Assertions.assertEquals(gameStatus.getStatus(), GameStatus.Status.X_WINS);
    }
}
