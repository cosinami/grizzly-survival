package com.cosinami.grizzlysurvival.interpreters;

import com.cosinami.grizzlysurvival.core.Buffer;
import com.cosinami.grizzlysurvival.desires.Desire;

import java.util.ArrayList;

/**
 * TODO: Placeholder text.
 */
public class CommandInterpreter implements Interpreter {
    @Override
    public boolean heartbeat() {
        return true;
    }

    @Override
    public void render(Buffer buffer) {}

    @Override
    public ArrayList<Desire> poll() {
        return null;
    }
}
