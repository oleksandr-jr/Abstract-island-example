package org.javarush.oleksandr.island.entity.oraganism.animal.herbivore;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.entity.Limits;
import org.javarush.oleksandr.island.entity.oraganism.Organism;
import org.javarush.oleksandr.island.entity.oraganism.animal.Animal;

import java.util.Map;

@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public abstract class Herbivore extends Animal {


    public Herbivore(String icon, Limits limits, boolean isAlive, int weight, int health, int age) {
        super(icon, limits, isAlive, weight, health, age);
    }

}
