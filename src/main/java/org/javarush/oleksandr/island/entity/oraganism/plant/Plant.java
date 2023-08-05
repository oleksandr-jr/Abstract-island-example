package org.javarush.oleksandr.island.entity.oraganism.plant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

@NoArgsConstructor
@SuperBuilder
@Getter
public abstract class Plant implements Organism {
    private int maxWeight;
    private int maxAmount;
}
