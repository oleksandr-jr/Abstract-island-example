package org.javarush.oleksandr.island;

import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.config.AppConfigurator;
import org.javarush.oleksandr.island.config.GameObjectsScanner;
import org.javarush.oleksandr.island.config.PrototypeLoader;
import org.javarush.oleksandr.island.engine.GameWorker;
import org.javarush.oleksandr.island.entity.oraganism.Organism;
import org.javarush.oleksandr.island.entity.oraganism.animal.herbivore.Horse;
import org.javarush.oleksandr.island.entity.oraganism.animal.herbivore.Rabbit;
import org.javarush.oleksandr.island.entity.oraganism.animal.predator.Wolf;
import org.javarush.oleksandr.island.entity.oraganism.plant.Cactus;
import org.javarush.oleksandr.island.factory.GameObjectPrototypeFactory;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        AppConfigurator.getInstance().init();

        GameObjectPrototypeFactory factory = GameObjectPrototypeFactory.getInstance();

        Set<GameObject> gameObjects = new HashSet<>();

        gameObjects.add(factory.create(Rabbit.class));
        gameObjects.add(factory.create(Wolf.class));
        gameObjects.add(factory.create(Cactus.class));

        GameWorker gameWorker = new GameWorker(gameObjects);

        gameWorker.play();

    }
}