package org.javarush.oleksandr.entity.oraganism.animal;

import org.javarush.oleksandr.abstraction.entity.Movable;
import org.javarush.oleksandr.entity.oraganism.Organism;

public abstract class Animal extends Organism implements Movable {
    private int maxSpeed;


    public Animal(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
