package org.javarush.oleksandr.island.entity.map;

import org.javarush.oleksandr.island.abstraction.annotations.Config;

@Config(fileName = "config/entities/map/map.yaml")
public class GameField {

    private int width;
    private int height;

    private final Cell[][] cells = new Cell[width][height];

    public Cell[][] getCells() {
        return cells;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
