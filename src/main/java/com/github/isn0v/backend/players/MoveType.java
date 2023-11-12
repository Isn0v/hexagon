package com.github.isn0v.backend.players;

import com.github.isn0v.backend.Point;

public enum MoveType {
    /**
     * Move 1 step far from current cell
     */
    SHORT,

    /**
     * Move 2 step far from current cell
     */
    LONG;

    public static MoveType getMoveType(Point src, Point dest) {
        if (Math.abs(src.X() - dest.X()) == 1 &&  Math.abs(src.Y() - dest.Y()) == 1) {
            return SHORT;
        } else {
            return LONG;
        }
    }
}
