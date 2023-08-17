package org.javarush.oleksandr.island.entity.oraganism.animal.predator;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.abstraction.annotations.Config;
import org.javarush.oleksandr.island.abstraction.annotations.GameObjectEntity;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

@GameObjectEntity
@Config(fileName = "config/entities/animals/predator/wolf.yaml")
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Wolf extends Predator {
    @Override
    public Wolf reproduce() {
        return Wolf.builder()
                .maxFood(this.getMaxFood())
                .maxSpeed(this.getMaxSpeed())
                .maxWeight(this.getMaxWeight())
                .maxAmount(this.getMaxAmount())
                .maxAge(1)
                .age(1)
                .health(1)
                .isAlive(true)
                .weight(1)
                .build();
    }

}
