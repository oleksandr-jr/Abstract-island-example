package org.javarush.oleksandr.island.config;

import org.javarush.oleksandr.island.factory.GameObjectPrototypeFactory;

/**
 * This class is responsible for application configuration at the startup.
 * <p>
 * It is responsible for:
 * <ul>
 * <li>Registering all prototypes of game objects</li>
 * </ul>
 */
public class AppConfigurator {

    private static AppConfigurator instance;
    private final GameObjectsScanner gameObjectsScanner = GameObjectsScanner.getInstance();
    private final PrototypeLoader prototypeLoader = PrototypeLoader.getInstance();
    private final GameObjectPrototypeFactory gameObjectFactory = GameObjectPrototypeFactory.getInstance();

    private AppConfigurator() {
    }

    public static AppConfigurator getInstance() {
        if (instance == null) {
            instance = new AppConfigurator();
        }
        return instance;
    }

    /**
     * This method is responsible for making all necessary configurations at the application startup.
     */
    public void init() {
        registerPrototypes();
        // TODO: implement gameField config loading.
        // TODO: implement gameField initialization with cells.
    }


    private void registerPrototypes() {
        gameObjectsScanner.
                getAllGameObjectsClasses()
                .stream()
                .map(prototypeLoader::loadPrototype)
                .forEach(gameObjectFactory::registerPrototype);
    }

}
