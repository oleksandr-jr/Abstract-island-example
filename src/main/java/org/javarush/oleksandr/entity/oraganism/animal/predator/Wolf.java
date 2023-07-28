package org.javarush.oleksandr.entity.oraganism.animal.predator;

import org.javarush.oleksandr.entity.oraganism.Organism;

public class Wolf extends Predator{
    public Wolf(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public Organism reproduce() {
        return null;
    }
}
