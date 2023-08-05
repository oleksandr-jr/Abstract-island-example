package org.javarush.oleksandr.island.entity.oraganism.animal.herbivore;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.entity.oraganism.animal.Animal;

@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public abstract class Herbivore extends Animal {

}
