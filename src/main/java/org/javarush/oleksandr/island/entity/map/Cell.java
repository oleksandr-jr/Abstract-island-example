package org.javarush.oleksandr.island.entity.map;

import lombok.Builder;
import lombok.Getter;
import org.javarush.oleksandr.island.entity.oraganism.Organism;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@Getter
@Builder
public class Cell {
    private static long serialUID = 1L;

    @Builder.Default
    private final long UID = serialUID++;
    /**
     * Lock for threads synchronization.
     */
    @Builder.Default
    private final ReentrantLock lock = new ReentrantLock();
    private final Map<Type, Set<Organism>> residents;

    public Map<Type, Set<Organism>> getResidents() {
        return residents;
    }
}
