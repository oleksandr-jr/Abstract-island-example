package org.javarush.oleksandr.island.entity.oraganism.animal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.entity.map.Cell;
import org.javarush.oleksandr.island.entity.oraganism.Movable;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

import java.beans.Transient;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    @JsonIgnore
    private Cell cell;

    private String icon;
    private int maxWeight;
    private int maxAmount;
    private int maxSpeed;
    private int maxFood;
    private int maxAge; // TODO: add maxAge to config files

    private boolean isAlive = true; // TODO: implement isAlive logic
    private int weight;
    private int health;  // TODO: implement health logic
    private int age; // TODO: implement age logic

    /**
     * This field is needed for storing target matrix for this organism.
     * It's a map of target organisms and the chance to hunt them.
     */
    @Builder.Default
    private Map<String, Integer> stringTargetMatrix = new HashMap<>();
    @Builder.Default
    private Map<Class<? extends GameObject>, Integer> targetMatrix = new HashMap<>(); // TODO: Implement target matrix

    @Override
    public void play() {
        System.out.println("Animal play");
        this.eat();
        this.move();
        this.reproduce();
    }

    public void eat() {

    }

    private void findFood() {
        Class<? extends GameObject> target = targetMatrix.keySet().stream().skip(1).findFirst().get();


        if (cell.getResidents().containsKey(target)) {

        }

        // TODO: implement find food logic;
    }

    // TODO: implement animal move method.
    @Override
    public void move() {
        System.out.println("Animal move");
    }

}
