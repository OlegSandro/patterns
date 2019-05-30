package com.example.factorymethod;

public class HardLevelGameGenerator implements GameGenerator {

    public Game createGame() {
        Game game = new HardLevelGame();
        game.setnMinuts(7);
        game.setnLetters(18);
        return game;
    }
}
