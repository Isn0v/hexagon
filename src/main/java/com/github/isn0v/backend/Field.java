package com.github.isn0v.backend;


public class Field {
    public static final int HEIGHT = 12;
    public static final int WIDTH = 12;

    private final Cell[][] field;
    
public static Cell[][] generateQuadraticField(int width, int height) {
    Cell[][] field = new Cell[width][height];

    for (int i = 0; i < width; i++) {
        for (int j = 0; j < height; j++) {
            field[i][j] = new Cell(CellState.EMPTY);
        }
    }

    return field;
}
    
    
    public Field(Cell[][] field) {
        this.field = field;
    }
    
    
}
