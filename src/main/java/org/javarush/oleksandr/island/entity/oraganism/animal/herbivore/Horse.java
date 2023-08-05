package org.javarush.oleksandr.island.entity.oraganism.animal.herbivore;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.annotations.Config;
import org.javarush.oleksandr.island.annotations.GameObject;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

@GameObject
@Config(fileName = "config/entities/animals/herbivore/horse.yaml")
@NoArgsConstructor
@SuperBuilder()
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Horse extends Herbivore {


    @Override
    public Organism reproduce() {
        return Horse.builder().maxFood(this.getMaxFood()).maxSpeed(this.getMaxSpeed()).build();
    }
}
