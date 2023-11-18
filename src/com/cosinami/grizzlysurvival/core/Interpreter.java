package com.cosinami.grizzlysurvival.core;

import com.cosinami.grizzlysurvival.core.Buffer;
import com.cosinami.grizzlysurvival.core.Desire;

import java.util.ArrayList;

/**
 * The interpreter is used as an abstract reference to the
 * frontend of the application. This allows Grizzly Survival to
 * utilize a GUI or other input implementation in future builds.
 *
 * The Intepreter interface is meant to be implemented within the
 * com.cosinami.grizzlysurvival.interpreters package and instantiated
 * through the loader contained in GrizzlySurvival.java.
 */
public interface Interpreter {
    /**
     * Checks the current status of the interpreter (whether
     * the process is still alive and able to handle input).
     * @return Current status of interpreter (true being OK).
     */
    boolean heartbeat();

    /**
     * Notifies the interpreter to redraw its frontend with
     * new content provided in the buffer.
     * The buffer represents the current version of the "world",
     * according to the internal State.
     */
    void render(Buffer buffer);

    /** TODO: Placeholder text. */
    ArrayList<Desire> poll();
}
