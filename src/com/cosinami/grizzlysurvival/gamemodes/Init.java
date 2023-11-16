package com.cosinami.grizzlysurvival.gamemodes;

import com.cosinami.grizzlysurvival.core.Buffer;
import com.cosinami.grizzlysurvival.core.State;
import com.cosinami.grizzlysurvival.desires.Desire;

import java.util.ArrayList;

/**
 * TODO: Placeholder text.
 * Gamemode that creates the initial configuration of State.
 */
public class Init implements Gamemode {
    @Override
    public void tick(State state) {}

    @Override
    public void process(ArrayList<Desire> desires) {}

    @Override
    public Buffer drawBuffer() {
        return null;
    }
}
