package com.cosinami.grizzlysurvival.interpreters;

import com.cosinami.grizzlysurvival.core.Buffer;
import com.cosinami.grizzlysurvival.core.Desire;
import com.cosinami.grizzlysurvival.core.Interpreter;

import java.util.ArrayList;

/**
 * The implementation for the CLI frontend of Grizzly Survival.
 * This interpreter should only provide TextDesire when being polled
 * for input.
 */
public class CommandInterpreter implements Interpreter {
    @Override
    public boolean heartbeat() {
        return false;
    }

    @Override
    public void render(Buffer buffer) {}

    @Override
    public ArrayList<Desire> poll() {
        return null;
    }
}
