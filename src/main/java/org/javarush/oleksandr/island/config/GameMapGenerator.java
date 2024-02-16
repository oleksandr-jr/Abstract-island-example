package org.javarush.oleksandr.island.config;

import lombok.Getter;
import org.javarush.oleksandr.island.entity.map.Cell;
import org.javarush.oleksandr.island.entity.map.GameMap;

import java.util.Map;

public class GameMapGenerator {
    @Getter
    private static final GameMapGenerator instance = new GameMapGenerator();
    private final CellGenerator cellGenerator = CellGenerator.getInstance();
    private final PrototypeLoader prototypeLoader = PrototypeLoader.getInstance();


    private GameMapGenerator() {
    }

    public GameMap createGameMap() {
        GameMap gameMap = prototypeLoader.loadPrototype(GameMap.class);

        Cell[][] cells = createCells(gameMap.getWidth(), gameMap.getHeight());

        mapCells(cells);

        gameMap.setCells(cells);

        return gameMap;
    }

    private Cell[][] createCells(int width, int height) {
        Cell[][] cells = new Cell[height][width];

        for (int i = 0; i < height; i++) {
            cells[i] = createRow(width);
        }

        return cells;
    }

    private Cell[] createRow(int width) {
        Cell[] row = new Cell[width];

        for (int i = 0; i < width; i++) {
            row[i] = cellGenerator.createCell();
        }

        return row;
    }

    private void mapCells(Cell[][] cells) {
        for (int row = 0; row < cells.length; row++) {
            for (int column = 0; column < cells[row].length; column++) {

                Cell currentCell = cells[row][column];

                Cell rightCell = null;
                Cell bottomCell = null;

                // Get right cell
                if (column < cells[row].length - 1) {
                    rightCell = cells[row][column + 1];
                }

                // getBottom cell
                if (row < cells.length - 1) {
                    bottomCell = cells[row + 1][column];
                }

                // Pair with right cell
                if (rightCell != null) {
                    currentCell.setNext(rightCell);
                    rightCell.setNext(currentCell);
                }

                // Pair with bottom cell
                if (bottomCell != null) {
                    currentCell.setNext(bottomCell);
                    bottomCell.setNext(currentCell);
                }
            }
        }
    }
}
