package com.github.isn0v.backend;

import com.github.isn0v.backend.players.BasePlayer;

public class Game {
    private final Field field;
    private final BasePlayer[] players;


    public Game(Field field, BasePlayer[] players) {
        this.field = field;
        this.players = players;
    }

}
