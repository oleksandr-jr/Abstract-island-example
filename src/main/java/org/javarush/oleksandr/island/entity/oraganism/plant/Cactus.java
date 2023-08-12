package org.javarush.oleksandr.island.entity.oraganism.plant;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.abstraction.annotations.Config;
import org.javarush.oleksandr.island.abstraction.annotations.GameObjectEntity;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

@GameObjectEntity
@Config(fileName = "config/entities/plants/cactus.yaml")
@NoArgsConstructor
@SuperBuilder
public class Cactus extends Plant {

    @Override
    public Cactus reproduce() {
        return new Cactus();
    }

}
