package com.github.isn0v.backend.players;

import java.util.ArrayList;

import com.github.isn0v.backend.Field;
import com.github.isn0v.backend.Point;

public abstract class BasePlayer {
    protected ArrayList<Point> cells = new ArrayList<Point>();
    protected final Field field;

    public BasePlayer(ArrayList<Point> cells, Field field) {
        this.cells = cells;
        this.field = field;
    }

    public void move(Point src, Point dst) {
        MoveType moveType = MoveType.getMoveType(src, dst);
        //TODO Check collisions
        switch (moveType) {
            case SHORT:{
                cells.add(dst);
                break;
            }
            case LONG:{
                cells.remove(src);
                cells.add(dst);
                break;
            }
        }
    }
}
