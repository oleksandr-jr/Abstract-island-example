package org.javarush.oleksandr.island.config;

import lombok.Getter;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.entity.map.Cell;
import org.javarush.oleksandr.island.factory.GameObjectPrototypeFactory;
import org.javarush.oleksandr.island.factory.PrototypeFactory;
import org.javarush.oleksandr.island.utils.Probably;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CellGenerator {

    private static final PrototypeFactory<GameObject> prototypeFactory = GameObjectPrototypeFactory.getInstance();
    private final GameObjectGenerator gameObjectGenerator = GameObjectGenerator.getInstance();

    @Getter
    private static final CellGenerator instance = new CellGenerator();


    public Cell createCell() {
        return Cell.builder()
                .residents(gameObjectGenerator.generateGameObjects())
                .build();
    }

}
