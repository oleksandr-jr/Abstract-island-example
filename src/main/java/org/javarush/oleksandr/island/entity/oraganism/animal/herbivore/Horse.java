package org.javarush.oleksandr.island.entity.oraganism.animal.herbivore;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.abstraction.annotations.Config;
import org.javarush.oleksandr.island.abstraction.annotations.GameObjectEntity;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

@GameObjectEntity
@Config(fileName = "config/entities/animals/herbivore/horse.yaml")
@NoArgsConstructor
@SuperBuilder()
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Horse extends Herbivore {

    @Override
    public GameObject reproduce() {
        return Horse.builder()
                .maxFood(this.getMaxFood())
                .maxSpeed(this.getMaxSpeed())
                .maxWeight(this.getMaxWeight())
                .maxAmount(this.getMaxAmount())
                .maxAge(16)
                .weight(this.getMaxWeight()) // TODO: Randomize weight
                .health(100) // TODO: Add max health implementation
                .age(0)
                .isAlive(true)
                .build();
    }

}
