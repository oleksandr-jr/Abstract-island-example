package org.javarush.oleksandr.island;

import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.config.AppConfigurator;
import org.javarush.oleksandr.island.config.CellGenerator;
import org.javarush.oleksandr.island.config.GameMapGenerator;
import org.javarush.oleksandr.island.config.PrototypeLoader;
import org.javarush.oleksandr.island.entity.map.Cell;
import org.javarush.oleksandr.island.entity.map.GameMap;
import org.javarush.oleksandr.island.entity.oraganism.animal.herbivore.Goat;
import org.javarush.oleksandr.island.entity.oraganism.animal.herbivore.Horse;
import org.javarush.oleksandr.island.factory.GameObjectPrototypeFactory;
import org.javarush.oleksandr.island.factory.PrototypeFactory;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        AppConfigurator.getInstance().init();

        GameMap gameMap = GameMap.getInstance();

        GameObject goat = GameObjectPrototypeFactory.getInstance().create(Goat.class);
        GameObject goa2 = GameObjectPrototypeFactory.getInstance().create(Goat.class);
        GameObject goa3 = GameObjectPrototypeFactory.getInstance().create(Goat.class);

        System.out.println(goa3);

//        Map<Class<? extends GameObject>, Set<GameObject>> residents = CellGenerator.getInstance().generateResidents();
//
//
//        residents.forEach((key, value) -> {
//            System.out.println(key.getSimpleName() + " " + value.size());
//        });



//        GameObjectPrototypeFactory factory = GameObjectPrototypeFactory.getInstance();

//        Set<GameObject> gameObjects = new HashSet<>();
//
//        gameObjects.add(factory.create(Rabbit.class));
//        gameObjects.add(factory.create(Wolf.class));
//        gameObjects.add(factory.create(Cactus.class));
//
//        GameWorker gameWorker = new GameWorker(gameObjects);
//
//        gameWorker.play();

    }
}