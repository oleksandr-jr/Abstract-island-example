package org.javarush.oleksandr.island.entity.oraganism.animal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;
import org.javarush.oleksandr.island.entity.Limits;
import org.javarush.oleksandr.island.entity.map.Cell;
import org.javarush.oleksandr.island.entity.oraganism.Movable;
import org.javarush.oleksandr.island.entity.oraganism.Organism;
import org.javarush.oleksandr.island.utils.Probably;

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
    private long UID = serialUID++;

    @JsonIgnore
    private Cell cell;

    private String icon;

    private Limits limits;

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


    public Animal(String icon, Limits limits, boolean isAlive, int weight, int health, int age) {
        this.UID = serialUID++;
        this.icon = icon;
        this.limits = limits;
        this.isAlive = isAlive;
        this.weight = weight;
        this.health = health;
        this.age = age;
    }

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

        Set<Class<? extends GameObject>> possibleTargets = targetMatrix.keySet();
        int random = Probably.randomInt(0, possibleTargets.size());

        possibleTargets.stream().skip(random).findFirst().ifPresent(TypeOfTargetToHunt -> {
            cell.getResidents().computeIfPresent(TypeOfTargetToHunt, (key, value) -> {
                value.stream().skip(Probably.randomInt(0, value.size())).findFirst().ifPresent(target -> {
                    // kill target
                });
                return value;
            });

            // TODO: implement find food logic;
        });
    }


    // TODO: implement animal move method.
    @Override
    public void move() {
        System.out.println("Animal move");
    }

}
