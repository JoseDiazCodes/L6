package doubledispatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Central simulation engine for managing space exploration.
 * Provides factory methods for creating planets and explorers,
 * and maintains a log of exploration activities.
 */
public class SimulationBuilder {
  /** List to store simulation log messages. */
  private static final List<String> simLog = new ArrayList<>();

  /**
   * Creates a new planet instance based on the provided name.
   * Case-insensitive planet name matching.
   *
   * @param name The name of the planet to create ("Mars", "Mercury", or "Venus")
   * @return A new planet instance, or null if the planet name is unknown
   */
  public static IPlanet createPlanet(String name) {
    if (name == null) {
      return null;
    }

    return switch (name.toLowerCase()) {
      case "mars" -> new Mars();
      case "mercury" -> new Mercury();
      case "venus" -> new Venus();
      default -> null;
    };
  }

  /**
   * Creates a new space explorer instance based on the provided name.
   * Case-insensitive explorer name matching.
   *
   * @param name The name of the explorer to create ("LifeExplorer" or "TerrainExplorer")
   * @return A new explorer instance, or null if the explorer name is unknown
   */
  public static ISpaceExplorer createExplorer(String name) {
    if (name == null) {
      return null;
    }

    return switch (name.toLowerCase()) {
      case "lifeexplorer" -> new LifeExplorer();
      case "terrainexplorer" -> new TerrainExplorer();
      default -> null;
    };
  }

  /**
   * Adds a message to the simulation log.
   *
   * @param message The message to add to the log
   */
  public static void addToLog(String message) {
    simLog.add(message);
  }

  /**
   * Gets a copy of the current simulation log.
   *
   * @return A new ArrayList containing all logged messages
   */
  public static List<String> getSimulationLog() {
    return new ArrayList<>(simLog);
  }
}