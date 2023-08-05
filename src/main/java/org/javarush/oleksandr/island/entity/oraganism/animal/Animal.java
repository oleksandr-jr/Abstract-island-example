package org.javarush.oleksandr.island.entity.oraganism.animal;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.entity.oraganism.Movable;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@SuperBuilder
@Getter
@EqualsAndHashCode
@ToString
public abstract class Animal implements Organism, Movable {
    private static long serialUID = 1L;

    /**
     * it's a serial Unique ID for each object of this class.
     * it's needed for generating different hash codes.
     * Annotation @Builder.Default is needed for excluding this field from builder.
     */
    @Builder.Default
    private final long UID = serialUID++;

    private String icon;
    private int maxWeight;
    private int maxAmount;
    private int maxSpeed;
    private int maxFood;

    // TODO: implement this fields.
    private int weight;
    private int health;
    private int age;

    /**
     * This field is needed for storing target matrix for this organism.
     * It's a map of target organisms and the chance to hunt them.
     */
    @Builder.Default
    private Map<String, Integer> stringTargetMatrix = new HashMap<>();
    @Builder.Default
    private Map<Class<? extends Organism>, Integer> targetMatrix = new HashMap<>();


    // TODO: implement animal move method.
    @Override
    public void move() {
        System.out.println("Animal move");
    }

}
