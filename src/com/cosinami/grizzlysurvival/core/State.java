package com.cosinami.grizzlysurvival.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * TODO: Placeholder text.
 */
public class State {
    /** TODO: Placeholder text. */
    private HashMap<Long, Entity> entities;

    /**
     * TODO: Placeholder text.
     * @param classType
     * @return
     */
    public ArrayList<Entity> getEntitiesByClass(Class classType) {
        ArrayList<Entity> filtered = new ArrayList<>();
        String className = classType.getPackageName();

        entities.forEach((id, entity) -> {
            if (entity.getClass().getPackageName() == className)
                filtered.add(entity);
        });

        return filtered;
    }

    /**
     * TODO: Placeholder text.
     * @param entityID
     * @return
     */
    public Entity getEntityWithID(long entityID) {
        return entities.get(entityID);
    }

    /**
     * TODO: Placeholder text.
     * @param tag
     * @return
     */
    public ArrayList<Entity> getEntitiesWithTag(String tag) {
        throw new RuntimeException();
    }

    /**
     * TODO: Placeholder text.
     * @param component
     * @return
     */
    public ArrayList<Entity> getEntitiesWithComponent(Component component) {
        throw new RuntimeException();
    }

    /**
     * TODO: Placeholder text.
     * @param entity
     */
    public void pushEntity(Entity entity) {
        entities.put(new Random().nextLong(), entity);
    }
}
