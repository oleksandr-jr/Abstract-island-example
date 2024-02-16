package org.javarush.oleksandr.island.factory;

import org.javarush.oleksandr.island.abstraction.interfaces.GameObject;

import java.util.Collection;
import java.util.Map;

public interface PrototypeFactory<T> {
    T create(Class<? extends T> type);
    Map<Class<? extends T>, T> getPrototypesMap();
    Collection<T> getPrototypes();
    void registerPrototype(T prototype);
}
