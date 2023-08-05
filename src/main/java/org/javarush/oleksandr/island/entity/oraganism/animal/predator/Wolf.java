package org.javarush.oleksandr.island.entity.oraganism.animal.predator;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.annotations.Config;
import org.javarush.oleksandr.island.annotations.GameObject;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

@GameObject
@Config(fileName = "config/entities/animals/predator/wolf.yaml")
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Wolf extends Predator {
    @Override
    public Organism reproduce() {
        return Wolf.builder()
                .maxFood(this.getMaxFood())
                .maxSpeed(this.getMaxSpeed())
                .build();
    }

    private void privateTestMethod() {
        System.out.println("Private Method");
    }

}
