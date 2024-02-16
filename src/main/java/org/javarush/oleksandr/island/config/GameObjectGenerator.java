package org.javarush.oleksandr.island.config;

import lombok.Getter;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.factory.GameObjectPrototypeFactory;
import org.javarush.oleksandr.island.factory.PrototypeFactory;
import org.javarush.oleksandr.island.utils.Probably;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GameObjectGenerator {

    private static final PrototypeFactory<GameObject> prototypeFactory = GameObjectPrototypeFactory.getInstance();

    private static GameObjectGenerator instance;

    private GameObjectGenerator(){
    }

    public static GameObjectGenerator getInstance() {
        if (instance == null) {
            instance = new GameObjectGenerator();
        }

        return instance;
    }

    public Map<Class<? extends GameObject>, Set<GameObject>> generateGameObjects() {

        Map<Class<? extends GameObject>, Set<GameObject>> residents = new HashMap<>();

        for (GameObject prototype : prototypeFactory.getPrototypes()) {
            Class<? extends GameObject> gameObjectType = prototype.getClass();

            residents.putIfAbsent(gameObjectType, new HashSet<>());
            Set<GameObject> gameObjectFamilyContainer = residents.get(gameObjectType);

            double randomAmount = Probably.randomInt(0, prototype.getLimits().getMaxAmount());

            for (int i = 0; i < randomAmount; i++) {
                gameObjectFamilyContainer.add(prototype.reproduce());
            }
        }

        return residents;
    }
}
