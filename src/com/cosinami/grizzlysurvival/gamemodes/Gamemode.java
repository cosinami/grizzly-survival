package com.cosinami.grizzlysurvival.gamemodes;

import com.cosinami.grizzlysurvival.core.Buffer;
import com.cosinami.grizzlysurvival.core.State;
import com.cosinami.grizzlysurvival.desires.Desire;

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
    Buffer drawBuffer();
}
