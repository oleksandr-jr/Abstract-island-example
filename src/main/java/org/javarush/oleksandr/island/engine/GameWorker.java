package org.javarush.oleksandr.island.engine;

import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;

import java.util.Set;

public class GameWorker {
    // TODO: Implement high level game logic here.

    private final Set<GameObject> gameObjects;

    public GameWorker(Set<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void play() {
        gameObjects.forEach(GameObject::play);
    }
}
