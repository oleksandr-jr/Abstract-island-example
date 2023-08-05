package org.javarush.oleksandr.island.entity.oraganism.plant;

import lombok.NoArgsConstructor;
import org.javarush.oleksandr.island.annotations.Config;
import org.javarush.oleksandr.island.annotations.GameObject;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

@GameObject
@Config(fileName = "config/entities/plants/cactus.yaml")
@NoArgsConstructor
public class Cactus extends Plant {

    @Override
    public Organism reproduce() {
        return null;
    }

}
