package org.javarush.oleksandr.island.config;

import org.javarush.oleksandr.island.abstraction.annotations.Config;
import org.javarush.oleksandr.island.abstraction.annotations.GameObjectEntity;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.entity.oraganism.Organism;
import org.reflections.Reflections;

import java.util.Set;

/**
 * Scans all classes in the project
 * and returns all classes that are implementing {@link org.javarush.oleksandr.island.entity.oraganism.Organism}
 * with {@link GameObjectEntity} annotation.
 */
public class GameObjectsScanner {
    private static final Reflections reflections = new Reflections("org.javarush.oleksandr.island");
    private static GameObjectsScanner instance;

    private GameObjectsScanner() {
    }

    public static GameObjectsScanner getInstance() {
        if (instance == null) {
            instance = new GameObjectsScanner();
        }
        return instance;
    }

    /**
     * Returns all classes that are implementing {@link org.javarush.oleksandr.island.entity.oraganism.Organism}
     * annotated with {@link GameObjectEntity}.
     *
     * @return set of classes extending Organism and annotated with {@link GameObjectEntity}.
     */
    public Set<Class<? extends GameObject>> getAllGameObjectsClasses() {
        return reflections.getSubTypesOf(GameObject.class)
                .stream()
                .filter(c -> c.isAnnotationPresent(GameObjectEntity.class))
                .filter(c -> c.isAnnotationPresent(Config.class))
                .collect(java.util.stream.Collectors.toSet());
    }

}
