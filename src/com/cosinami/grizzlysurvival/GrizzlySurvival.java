package com.cosinami.grizzlysurvival;

import com.cosinami.grizzlysurvival.core.Project;
import com.cosinami.grizzlysurvival.core.State;
import com.cosinami.grizzlysurvival.gamemodes.Gamemode;
import com.cosinami.grizzlysurvival.gamemodes.Init;
import com.cosinami.grizzlysurvival.interpreters.CommandInterpreter;
import com.cosinami.grizzlysurvival.interpreters.Interpreter;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Placeholder text.
 */
public class GrizzlySurvival {
    /**
     * Program entry point.
     * @param args Command-line arguments provided by the shell.
     */
    public static void main(String[] args) throws IOException {
        // TODO: Explain.
        Yaml yaml = new Yaml(new Constructor(Project.class, new LoaderOptions()));
        Project project = yaml.load(Files.readString(Paths.get("project.yaml")));

        System.out.println("Grizzly Survival, ver. "
                + project.versioning.major + "."
                + project.versioning.minor + "."
                + project.versioning.patch + ".");
        System.out.println("Developed by Camden Johnson <contact@cosinami.com>");
        System.out.println("Written as a reference for 'Chris' B.\n");

        // To restart the game, simply dispose of this object and recreate it.
        new GrizzlySurvival();
    }

    /** TODO: Placeholder text. */
    Interpreter interpreter;
    /** TODO: Placeholder text. */
    State state;
    /** TODO: Placeholder text. */
    Gamemode gamemode;

    /**
     * TODO: Placeholder text.
     */
    public GrizzlySurvival() {
        // Temporary default interpreter. Receives input from stdin.
        // FIXME: Replace with effective interpreter loader.
        interpreter = new CommandInterpreter();

        state = new State();
        // Default gamemode used to initialize and configure state.
        gamemode = new Init();

        do {
            // Step 1. Update state according to gamemode.
            gamemode.tick(state);
            // Step 2. Create and render the game buffer.
            interpreter.render(gamemode.drawBuffer());
            // Step 3. Process input received by the user.
            gamemode.process(interpreter.poll());
            // TODO: Step 4. Swap gamemode if necessary.
        } while (interpreter.heartbeat());
    }
}
