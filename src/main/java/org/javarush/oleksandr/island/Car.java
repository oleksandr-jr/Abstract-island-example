package org.javarush.oleksandr.island;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class Car {

    private final Engine engine = new Engine(); // Композиція
    private Person driver;  // Агрегація

    public Car() {
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }
}
