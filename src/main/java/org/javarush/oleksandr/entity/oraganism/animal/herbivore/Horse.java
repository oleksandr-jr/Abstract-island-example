package org.javarush.oleksandr.entity.oraganism.animal.herbivore;

import org.javarush.oleksandr.entity.oraganism.Organism;

public class Horse extends Herbivore{
    public Horse(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public Organism reproduce() {
        return null;
    }
}
