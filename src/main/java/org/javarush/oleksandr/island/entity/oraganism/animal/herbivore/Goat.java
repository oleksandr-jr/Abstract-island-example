package org.javarush.oleksandr.island.entity.oraganism.animal.herbivore;

import org.javarush.oleksandr.island.abstraction.annotations.Config;
import org.javarush.oleksandr.island.abstraction.annotations.GameObjectEntity;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.entity.Limits;

@GameObjectEntity
@Config(fileName = "config/entities/animals/herbivore/goat.yaml")
public class Goat extends Herbivore{

    public Goat() {
        super();
    }

    public Goat(String icon, Limits limits, boolean isAlive, int weight, int health, int age) {
        super(icon, limits, isAlive, weight, health, age);
    }

    @Override
    public GameObject reproduce() {
        return new Goat(this.getIcon(), this.getLimits(), true, this.getWeight(), this.getHealth(), 0);
    }
}
