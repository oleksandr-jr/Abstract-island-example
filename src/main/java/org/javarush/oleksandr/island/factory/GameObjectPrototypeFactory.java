package org.javarush.oleksandr.island.factory;

import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Factory for creating organisms.
 * <p>  It can be replaced by Factory Method pattern.</p>
 */
public class GameObjectPrototypeFactory implements PrototypeFactory<GameObject> {
    private static GameObjectPrototypeFactory instance;
    private final Map<Class<? extends GameObject>, GameObject> prototypes = new HashMap<>();

    private GameObjectPrototypeFactory() {
    }

    public static GameObjectPrototypeFactory getInstance() {
        if (instance == null) {
            instance = new GameObjectPrototypeFactory();
        }
        return instance;
    }

    public void registerPrototype(GameObject prototype) {
        prototypes.put(prototype.getClass(), prototype);
    }

    @Override
    public GameObject create(Class<? extends GameObject> type) {
        if (!prototypes.containsKey(type)) {
            throw new IllegalArgumentException();
        }

        return prototypes.get(type).reproduce();
    }

    @Override
    public Map<Class<? extends GameObject>, GameObject> getPrototypesMap() {
        return prototypes;
    }

    @Override
    public Collection<GameObject> getPrototypes() {
        return prototypes.values();
    }

}
