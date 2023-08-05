package org.javarush.oleksandr.island.factory;

import org.javarush.oleksandr.island.entity.oraganism.Organism;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory for creating organisms.
 * <p>  It can be replaced by Factory Method pattern.</p>
 */
public class OrganismPrototypeFactory implements PrototypeFactory<Organism> {
    private static OrganismPrototypeFactory instance;
    private final Map<Class<? extends Organism>, Organism> prototypes = new HashMap<>();

    private OrganismPrototypeFactory() {
    }

    public static OrganismPrototypeFactory getInstance() {
        if (instance == null) {
            instance = new OrganismPrototypeFactory();
        }
        return instance;
    }

    public void registerPrototype(Organism prototype) {
        prototypes.put(prototype.getClass(), prototype);
    }

    @Override
    public Organism create(Class<? extends Organism> type) {
        if (!prototypes.containsKey(type)) {
            throw new IllegalArgumentException();
        }
        Organism prototype = prototypes.get(type);

        return prototype.reproduce();
    }

}
