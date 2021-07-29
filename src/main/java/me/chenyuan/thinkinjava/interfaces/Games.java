package me.chenyuan.thinkinjava.interfaces;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description A game framework using Factory methods.
 * @Date 2021/7/29
 * @Version 1.0
 */
interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    public static final int MOVES = 3;

    @Override
    public boolean move() {
        Console.log("Checkers move {}", moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game {
    private int moves = 0;
    public static final int MOVES = 4;

    @Override
    public boolean move() {
        Console.log("Checkers move {}", moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}

public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) {}
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
