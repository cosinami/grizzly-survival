package com.cosinami.grizzlysurvival.gamemodes;

import com.cosinami.grizzlysurvival.core.Buffer;
import com.cosinami.grizzlysurvival.core.Gamemode;
import com.cosinami.grizzlysurvival.core.State;
import com.cosinami.grizzlysurvival.core.Desire;

import java.util.ArrayList;

/**
 * The gamemode responsible for the initial configuration of State.
 * This gamemode should always exist, and will be the first gamemode
 * utilized upon a new instance of com.cosinami.grizzlysurvival.GrizzlySurvival
 * being created.
 */
public class Init implements Gamemode {
    @Override
    public void tick(State state) {
        System.out.println("----------------------------");
        System.out.println("Welcome to Grizzly Survival!");
        System.out.println(" Press 'Enter' to continue.");
        System.out.println("----------------------------");
    }

    @Override
    public void process(ArrayList<Desire> desires) {}

    @Override
    public boolean busy() {
        throw new RuntimeException();
    }

    @Override
    public Buffer drawBuffer() {
        return null;
    }
}
