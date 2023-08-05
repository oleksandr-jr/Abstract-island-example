package org.javarush.oleksandr.island.config;

import org.javarush.oleksandr.island.annotations.GameObject;
import org.javarush.oleksandr.island.entity.oraganism.Organism;
import org.reflections.Reflections;

import java.util.Set;

/**
 * Scans all classes in the project
 * and returns all classes that are implementing {@link org.javarush.oleksandr.island.entity.oraganism.Organism}
 * with {@link org.javarush.oleksandr.island.annotations.GameObject} annotation.
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
     * annotated with {@link org.javarush.oleksandr.island.annotations.GameObject}.
     *
     * @return set of classes extending Organism and annotated with {@link org.javarush.oleksandr.island.annotations.GameObject}.
     */
    public Set<Class<? extends Organism>> getAllGameObjectsClasses() {
        return reflections.getSubTypesOf(Organism.class)
                .stream()
                .filter(c -> c.isAnnotationPresent(GameObject.class))
                .collect(java.util.stream.Collectors.toSet());
    }

}
