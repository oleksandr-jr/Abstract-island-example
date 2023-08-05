package org.javarush.oleksandr.island.factory;

public interface PrototypeFactory<T> {
    T create(Class<? extends T> type);
}
