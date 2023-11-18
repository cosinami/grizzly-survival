package com.cosinami.grizzlysurvival.core;

import java.util.ArrayList;

/**
 * TODO: Placeholder text.
 */
public interface Gamemode {
    /** TODO: Placeholder text. */
    void tick(State state);

    /** TODO: Placeholder text. */
    void process(ArrayList<Desire> desires);

    /** TODO: Placeholder text. */
    boolean busy();

    /** TODO: Placeholder text. */
    Buffer drawBuffer();
}
