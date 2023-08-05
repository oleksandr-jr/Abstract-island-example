package org.javarush.oleksandr.island;

import org.javarush.oleksandr.island.config.AppConfigurator;
import org.javarush.oleksandr.island.entity.oraganism.Organism;
import org.javarush.oleksandr.island.entity.oraganism.animal.herbivore.Horse;
import org.javarush.oleksandr.island.factory.OrganismPrototypeFactory;


public class Main {
    public static void main(String[] args) {
        AppConfigurator.getInstance().init();

        OrganismPrototypeFactory factory = OrganismPrototypeFactory.getInstance();

        Organism prototype = factory.create(Horse.class);

        System.out.println(prototype);
    }
}