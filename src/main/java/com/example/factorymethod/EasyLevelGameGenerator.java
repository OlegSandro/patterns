package com.example.factorymethod;

public class EasyLevelGameGenerator implements GameGenerator {

    public Game createGame() {
        Game game = new EasyLevelGame();
        game.setnMinuts(10);
        game.setnLetters(22);
        return game;
    }
}
