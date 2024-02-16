package org.javarush.oleksandr.island.entity.map;

import lombok.*;
import org.javarush.oleksandr.island.abstraction.annotations.Config;

@Config(fileName = "config/entities/map/map.yaml")
@Getter
@NoArgsConstructor
@ToString
public class GameMap {
    @Getter
    @Setter
    private static GameMap instance;

    private int width;
    private int height;


    @Setter
    private Cell[][] cells;
}
