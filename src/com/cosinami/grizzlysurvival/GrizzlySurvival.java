package com.cosinami.grizzlysurvival;

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
     * TODO: Placeholder text.
     * @param args
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

        // TODO: Explain.
        CommandInterpreter interpreter = new CommandInterpreter();
        State state = new State();

        // TODO: Implement game loop.
    }
}
